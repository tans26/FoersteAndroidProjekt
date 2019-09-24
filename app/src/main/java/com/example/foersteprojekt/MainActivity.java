package com.example.foersteprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.foersteprojekt.EXTRA_TEXT";

    //String name;

    //EditText nameInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //nameInput = (EditText) findViewById(R.id.nameInput);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //name = nameInput.getText().toString();
                Insend();
                //showToast(name);

            }
        });

    }

    public void Insend(){
        EditText editText1 = findViewById(R.id.nameInput);
        String text = editText1.getText().toString();


        Intent intent = new Intent (this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);

        startActivity(intent);



    }


    //private void showToast(String text){
        //Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();


    }
//}