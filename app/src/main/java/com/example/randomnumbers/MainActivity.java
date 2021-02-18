package com.example.randomnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //declare
    TextView txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //define for access
        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        //action to perform when clicked on the button
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n") //to remove the warning
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(1000); // save random number in an integer variable
                txt.setText(Integer.toString(val)); //convert to String and set it as text inside the textview
            }
        });

    }
}