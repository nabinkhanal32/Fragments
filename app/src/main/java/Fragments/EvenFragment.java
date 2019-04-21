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
public class EvenFragment extends Fragment implements View.OnClickListener{
    private EditText etEven;
    private Button btnEven;

    public EvenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_even, container, false);

        etEven = view.findViewById(R.id.etEven);
        btnEven = view.findViewById(R.id.btnEven);
        btnEven.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v)
    {
        int num = Integer.parseInt(etEven.getText().toString());
        if (num%2==0)
        {
            Toast.makeText(getActivity(), "The number is even", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getActivity(), "The number is odd", Toast.LENGTH_SHORT).show();
        }
    }
}
