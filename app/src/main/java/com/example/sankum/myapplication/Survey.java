package com.example.sankum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Survey extends AppCompatActivity implements View.OnClickListener {

    Spinner breed_spinner;
    Spinner age_spinner;
    Spinner color_spinner;
    Spinner energylevel_spinner;
    Button submit_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        breed_spinner=(Spinner) findViewById(R.id.spinner5);
        age_spinner= (Spinner) findViewById(R.id.spinner2);
        color_spinner=(Spinner) findViewById(R.id.spinner4);
        energylevel_spinner=(Spinner) findViewById(R.id.spinner6);
        submit_button=(Button) findViewById(R.id.SUBMIT);





    }

    @Override
    public void onClick(View view) {

    }
}

