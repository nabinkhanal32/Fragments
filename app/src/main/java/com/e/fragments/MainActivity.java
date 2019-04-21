package com.e.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Fragments.EvenFragment;
import Fragments.FirstFragment;
import Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

{
    private Button btnFragment;

    private int status = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment = findViewById(R.id.btnFragment);

        btnFragment.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status==0)
        {
            FirstFragment firstFragment = new FirstFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
            fragmentTransaction.commit();
            fragmentTransaction.addToBackStack(null);
            btnFragment.setText("Load Second Fragment");
            status ++;
        }
        else if (status==1){
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,secondFragment);
            fragmentTransaction.commit();
            fragmentTransaction.addToBackStack(null);
            btnFragment.setText("Load Third Fragment");
            status++;
        }
            else {
            EvenFragment evenFragment = new EvenFragment();
            fragmentTransaction.replace(R.id.fragmentContainer,evenFragment);
            fragmentTransaction.commit();
            fragmentTransaction.addToBackStack(null);
            btnFragment.setText("Load First Fragment");
            status= 0;
        }

    }
}
