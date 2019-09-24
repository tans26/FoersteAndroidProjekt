package com.example.foersteprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tiden = findViewById(R.id.aktuelTid);

        String tidTekst = "" + new Date();

        tiden.setText(tidTekst);


        Button b = findViewById(R.id.knappen);

        b.setText("Tryk på mig");

        b.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {



    }
}