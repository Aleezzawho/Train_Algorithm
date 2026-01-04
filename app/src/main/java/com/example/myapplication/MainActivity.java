package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void disable(View v) {
//        v.setEnabled(false);
//    }

    public void getOrderText(View view) {
        TextView t = findViewById(R.id.OrderString);
        String input = t.getText().toString();

        Log.d("Info", input);
    }
}