package Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener
{
    private Button btncalc1;
    private EditText etThird;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);
        btncalc1 = view.findViewById(R.id.btnCalc1);
        etThird = view.findViewById(R.id.etThird);

        btncalc1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etThird.getText().toString());
        float area = 3.14f * radius * radius;
        Toast.makeText(getActivity(), "Area of circle is" + area, Toast.LENGTH_SHORT).show();
    }
}
