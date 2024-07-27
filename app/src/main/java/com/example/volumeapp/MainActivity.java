package com.example.volumeapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<shape> shapeArrayList;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.GridView);
        shapeArrayList = new ArrayList<>();

        shape sphere = new shape(R.drawable.sphere, "Sphere");
        shapeArrayList.add(sphere);
        shape cube = new shape(R.drawable.cube, "Cube");
        shapeArrayList.add(cube);
        shape cylinder = new shape(R.drawable.cylinder, "Cylinder");
        shapeArrayList.add(cylinder);
        shape rectangle = new shape(R.drawable.rectangle, "Cuboid");
        shapeArrayList.add(rectangle);

        adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = null;
                switch (position) {
                    case 0:
                        i = new Intent(MainActivity.this, sphere.class);
                        break;
                    case 1:
                        i = new Intent(MainActivity.this, cube.class);
                        break;
                    case 2:
                        i = new Intent(MainActivity.this, cylinder.class);
                        break;
                    case 3:
                        i = new Intent(MainActivity.this, rectangle.class);
                        break;
                    default:
                        return;
                }
                startActivity(i);
            }
        });

    }
}