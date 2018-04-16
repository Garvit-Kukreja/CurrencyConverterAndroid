package com.example.garvit.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void Us(View view)
    {
        EditText InrEditText = (EditText)findViewById(R.id.InrEditText);
        String in = InrEditText.getText().toString();
        double ind= Double.parseDouble(in);
        double us = ind*0.016;
        Toast.makeText(this, in+" INR equals to "+us+"US Dollar", Toast.LENGTH_LONG).show();
    }
    public void Ch(View view)
    {
        EditText InrEditText = (EditText)findViewById(R.id.InrEditText);
        String in = InrEditText.getText().toString();
        double ind= Double.parseDouble(in);
        double ch = ind*0.10;
        Toast.makeText(this, in+" INR equals to "+ch+" Chinese Yuan", Toast.LENGTH_LONG).show();
    }
    public void Bt(View view)
    {
        EditText InrEditText = (EditText)findViewById(R.id.InrEditText);
        String in = InrEditText.getText().toString();
        double ind= Double.parseDouble(in);
        double bt = ind*0.0000011;
        Toast.makeText(this, in+" INR equals to "+bt+" BitCoin", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
