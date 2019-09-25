package com.example.foersteprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NEXT_TEXT = "com.example.foersteprojekt.NEXT_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Indsend();
            }
        });

    }

    public void Indsend(){
        EditText editText1 = findViewById(R.id.nameInput);
        String text = editText1.getText().toString();


        Intent intent = new Intent (this, Activity2.class);
        intent.putExtra(NEXT_TEXT, text);

        startActivity(intent);
        System.out.println("Der blev trykket");



    }
}
