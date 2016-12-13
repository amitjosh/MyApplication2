package com.example.sankum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ContactUI extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewCTS;
    private TextView textViewSN;
    private TextView textViewAddress;
    private TextView textViewTelephone;
    private EditText editTextSN;
    private EditText editTextAddress;
    private EditText editTextTelephone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_ui);

        textViewCTS = (TextView)findViewById(R.id.textViewCTS);
        textViewSN = (TextView) findViewById(R.id.textViewSN);
        textViewAddress = (TextView)findViewById(R.id.textViewAddress);
        textViewTelephone = (TextView)findViewById(R.id.textViewTelephone);
        editTextSN=(EditText)findViewById(R.id.editTextSN);
        editTextAddress=(EditText)findViewById(R.id.editTextAddress);
        editTextTelephone = (EditText)findViewById(R.id.editTextTelephone);


    }

    @Override
    public void onClick(View view) {

    }
}