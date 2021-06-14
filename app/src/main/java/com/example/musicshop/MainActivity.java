package com.example.musicshop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public int quantity = 0;
    Spinner spinner;
    ArrayList spinnerArrayList;
    ArrayAdapter spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinnerArrayList = new ArrayList();

        spinnerArrayList.add("Guitar");
        spinnerArrayList.add("Drums");
        spinnerArrayList.add("Keyboard");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArrayList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

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