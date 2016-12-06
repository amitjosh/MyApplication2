package com.example.sankum.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

public class Survey extends UserProfile {

    Spinner breed_spinner;
    Spinner age_spinner;
    Spinner color_spinner;
    Spinner energylevel_spinner;
    Button submit_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breed_spinner=(Spinner) findViewById(R.id.breed_spinner);
        age_spinner= (Spinner) findViewById(R.id.age_spinner);
        color_spinner=(Spinner) findViewById(R.id.color_spinner);
        energylevel_spinner=(Spinner) findViewById(R.id.energylevel_spinner);
        submit_button=(Button) findViewById(R.id.submit_button);





    }
}

