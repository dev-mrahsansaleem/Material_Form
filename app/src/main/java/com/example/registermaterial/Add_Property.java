package com.example.registermaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Add_Property extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__property);

        Spinner propertyPurpose = (Spinner) findViewById(R.id.propertyPurposeS);

        propertyPurpose.setOnItemSelectedListener(this);
    }

    public void onSubmit(View v){
        startActivity(new Intent(getBaseContext(),drawer.class));
    }
    public void onChoose(View v){
        startActivity(new Intent(getBaseContext(),imageSlider.class));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedText=parent.getItemAtPosition(position).toString();
        if(selectedText.equals("Rent"))
        {
            findViewById(R.id.maintainceCharges).setVisibility(View.VISIBLE);
            findViewById(R.id.advancePrice).setVisibility(View.VISIBLE);
            findViewById(R.id.rentalPrice).setVisibility(View.VISIBLE);
            findViewById(R.id.periodUnit).setVisibility(View.VISIBLE);
            findViewById(R.id.minimumContractPeriod).setVisibility(View.VISIBLE);
        }
        else{
            findViewById(R.id.maintainceCharges).setVisibility(View.GONE);
            findViewById(R.id.advancePrice).setVisibility(View.GONE);
            findViewById(R.id.rentalPrice).setVisibility(View.GONE);
            findViewById(R.id.periodUnit).setVisibility(View.GONE);
            findViewById(R.id.minimumContractPeriod).setVisibility(View.GONE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
