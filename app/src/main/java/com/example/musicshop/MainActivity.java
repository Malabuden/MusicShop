package com.example.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addCountItems(View view) {
        quantity++;
        TextView countView = findViewById(R.id.count);
        countView.setText("" + quantity);
        //countView.setBackgroundColor(Color.YELLOW);
        //countView.setTextSize(20);
    }

    public void decreaseQuantity(View view) {
        if (quantity > 0) {
            quantity--;
            TextView countView = findViewById(R.id.count);
            countView.setText("" + quantity);
        } else {
            TextView countView = findViewById(R.id.count);
            countView.setText("0");
        }
    }
}