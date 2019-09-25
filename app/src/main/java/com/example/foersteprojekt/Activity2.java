package com.example.foersteprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    Button button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.NEXT_TEXT);

        TextView textView1 = findViewById(R.id.textView1);

        textView1.setText("Velkommen " + text + "!");


        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    public void onClick(View v) {
        System.out.println("Der blev trykket på en knap");

        if (v == button2) {

            button2.setText("Du trykkede på mig. Tak! \n");

        } else if (v == button3) {

            button3.setText("Viderestiller\n");

            startActivity(new Intent(Activity2.this, Activity3.class));

        }
    }
}