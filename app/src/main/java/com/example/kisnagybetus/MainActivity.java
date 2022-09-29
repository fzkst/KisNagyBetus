package com.example.kisnagybetus;



import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText textIn;
    private Button btnUpp;
    private Button btnLow;
    private Button btnRandom;
    private TextView textOut;
    private int randomColor;

    public void Transform(){
        textIn = (EditText) findViewById(R.id.textIn);
        btnUpp = (Button) findViewById(R.id.btnCap);
        btnLow = (Button) findViewById(R.id.btnSmall);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        textOut = (TextView) findViewById(R.id.textOut);

        btnUpp.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                textOut.setText(textIn.getText().toString().toUpperCase());
            }
        });

        btnLow.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                textOut.setText(textIn.getText().toString().toLowerCase());
            }
        });

        btnRandom.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int red = random.nextInt(256);
                int green = random.nextInt(256);
                int blue = random.nextInt(256);

                textOut.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Transform();
    }
}