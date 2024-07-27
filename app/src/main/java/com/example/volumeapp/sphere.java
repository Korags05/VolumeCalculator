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

public class sphere extends AppCompatActivity {

    TextView sphereCalc, SphereResult;
    Button calc;
    EditText radius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereCalc = findViewById(R.id.sphereCalc);
        SphereResult = findViewById(R.id.SphereResult);
        calc = findViewById(R.id.calc);
        radius = findViewById(R.id.radius);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sphereRadius = radius.getText().toString();
                int r = Integer.parseInt(sphereRadius);
                double volume = (4.0 / 3.0) * 3.14 * r * r * r;
                SphereResult.setText("Volume of sphere = "+ volume+" m^3");
            }
        });

    }
}