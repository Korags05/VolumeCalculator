package com.example.volumeapp;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<shape> {
    private ArrayList<shape> shapeList;
    Context context;
    public MyCustomAdapter(ArrayList<shape> shapeList, Context context) {
        super(context, R.layout.grid_item, shapeList);
        this.shapeList = shapeList;
        this.context = context;
    }

    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImage;
    }

    @NonNull
    @Override
    public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
        shape shapes = getItem(position);
        MyViewHolder myViewHolder;

        if (convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImage = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImage.setImageResource(shapes.getShapeImg());
        return convertView;
    }

}
