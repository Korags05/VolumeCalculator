package com.example.volumeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class rectangle extends AppCompatActivity {

    TextView RectCalc, RectRes;
    Button Vol;
    EditText lenght, RectHeight, breadth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        RectCalc = findViewById(R.id.RectCalc);
        RectRes = findViewById(R.id.RectRes);
        Vol = findViewById(R.id.Vol);
        lenght = findViewById(R.id.lenght);
        RectHeight = findViewById(R.id.RectHeight);
        breadth = findViewById(R.id.breadth);

        Vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Rlenght = lenght.getText().toString();
                int l = Integer.parseInt(Rlenght);
                String Rheight = RectHeight.getText().toString();
                int h = Integer.parseInt(Rheight);
                String Rbreadth = breadth.getText().toString();
                int b = Integer.parseInt(Rbreadth);
                double volume = l * h * b;
                RectRes.setText("Volume of Cuboid = "+ volume +" m^3");
            }
        });

    }
}