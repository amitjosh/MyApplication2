package com.example.sankum.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ContactUI extends Activity {
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
}