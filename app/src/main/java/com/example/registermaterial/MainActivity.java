package com.example.registermaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onregclick(View v)
    {
        Intent login =new Intent(getBaseContext(),drawer.class);
        startActivity(login);
    }
    public void onchoose(View v)
    {
        Intent login =new Intent(getBaseContext(),buildInNavDrawer.class);
        startActivity(login);
    }
}
