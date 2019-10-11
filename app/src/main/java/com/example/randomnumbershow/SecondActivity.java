package com.example.randomnumbershow;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber(){
        int count = getIntent().getIntExtra("total_count",0);
        int randomInt = 0;
        Random randomNumber = new Random();
        if(count > 0){
            randomInt = randomNumber.nextInt(count);
        }

        TextView randomNumTextView = (TextView) findViewById(R.id.txt_random_number);
        randomNumTextView.setText(Integer.toString(randomInt));

        TextView randomTitleTextView = (TextView) findViewById(R.id.txt_random_title);
        randomTitleTextView.setText(getString(R.string.random_header,count));
    }
}
