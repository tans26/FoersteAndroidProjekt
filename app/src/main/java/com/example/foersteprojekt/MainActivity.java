package com.example.foersteprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;




public class MainActivity extends AppCompatActivity {


    String name;

    EditText nameInput;

    Button okKnap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.nameInput);

        okKnap = (Button) findViewById(R.id.okKnap);
        okKnap.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();

                showToast(name);

            }
        });

    }

    private void showToast(String text){
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();


    }
}