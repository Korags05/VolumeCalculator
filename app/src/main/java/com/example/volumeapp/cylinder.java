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

public class cylinder extends AppCompatActivity {

    TextView cylinderCalc, CylinderResult;
    EditText CylinderRadius, CylinderHeight;
    Button CylinderCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        CylinderCalc = findViewById(R.id.CylinderCalc);
        CylinderResult = findViewById(R.id.CylinderResult);
        CylinderRadius = findViewById(R.id.CylinderRadius);
        CylinderHeight = findViewById(R.id.CylinderHeight);

        CylinderCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = CylinderRadius.getText().toString();
                int r = Integer.parseInt(radius);
                String height = CylinderHeight.getText().toString();
                int h = Integer.parseInt(height);
                double volume = 3.14 * r * r * h;
                CylinderResult.setText("Volume of cylinder = "+ volume+" m^3");
            }});

    }
}