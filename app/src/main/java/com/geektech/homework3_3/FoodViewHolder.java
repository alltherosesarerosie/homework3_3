package com.geektech.homework3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_food;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_food =itemView.findViewById(R.id.tv_food);
    }

    public void bind(String food){
        tv_food.setText(food);
    }

}
