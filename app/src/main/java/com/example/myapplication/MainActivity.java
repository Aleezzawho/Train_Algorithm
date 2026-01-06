package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        List<Integer> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            result.add(Integer.parseInt(matcher.group()));
        }

        List<Integer> extra = new ArrayList<>();
        List<Integer> final1 = new ArrayList<>();
        List<String> Jaaygasht = new ArrayList<>();
        List<String> helpingSina = new ArrayList<>();

        Log.d("MainActivity", "result = " + result);

        //mostaghim biad bere     => M
        //bere paeen              => P
        //Az paeen biad bere      => J

        int index = 0;

        for(int i = 1; i <= result.size(); i++) {
            if (i == result.get(index)) {
                final1.add(i);
                index++;
                helpingSina.add("M");
                Jaaygasht.add("D1");
            }
            else if (!extra.isEmpty() && extra.get(extra.size() - 1) == result.get(index)) {
                final1.add(extra.get(extra.size() - 1));
                index++;
                extra.remove(extra.size() - 1);
                i--;
                helpingSina.add("J");
                Jaaygasht.add("D1");
            }
            else {
                extra.add(i);
                helpingSina.add("P");
                Jaaygasht.add("I1");
            }
        }

        if (result.size() != final1.size()) {
            Log.d("MainActivity", "False");
        }
        else {
            Log.d("MainActivity", "True");
        }
    }
}