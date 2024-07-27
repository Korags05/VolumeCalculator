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

import org.w3c.dom.Text;

public class cube extends AppCompatActivity {

    TextView CubeCalc, CubeResult;
    EditText edge;
    Button VolCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        CubeCalc = findViewById(R.id.CubeCalc);
        CubeResult = findViewById(R.id.CubeResult);
        edge = findViewById(R.id.edge);
        VolCalc = findViewById(R.id.VolCalc);

        VolCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edgeValue = edge.getText().toString();
                int e = Integer.parseInt(edgeValue);
                double vol = e * e * e;
                CubeResult.setText("Volume of cube = "+ vol+" m^3");
            }
        });

    }
}