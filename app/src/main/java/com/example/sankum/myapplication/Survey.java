package com.example.sankum.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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


        submit_button.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Loading the WOOF", Toast.LENGTH_SHORT).show();
        //String name = editText.getText().toString();
        //String emailAddress = editText2.getText().toString();
        //String zipcode = editText3.getText().toString();
        //RatingBar hometime = (RatingBar) ratingBar.getOnRatingBarChangeListener();
        //RatingBar outdoor = (RatingBar) ratingBar2.getOnRatingBarChangeListener();
        //Userprofile userprofile = new Userprofile(name,emailAddress, zipcode,hometime , outdoor);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Users");
        // DatabaseReference newuser = myRef.push();
        //myRef.setValue(userprofile);

        Intent intent = new Intent(Survey.this, SplashActivity.class);
        startActivity(intent);

    }
}

