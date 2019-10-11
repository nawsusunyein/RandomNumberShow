package com.example.randomnumbershow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view){
        Toast toast =  Toast.makeText(this,"Hello toast!",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countNumber(View view){
        TextView showCountTextView = (TextView) findViewById(R.id.txt_count_number);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        showCountTextView.setText(count.toString());
    }

    public void goToRandomNumberScreen(View view){
        Intent randomIntent = new Intent(this,SecondActivity.class);
        TextView showCountTextView = (TextView) findViewById(R.id.txt_count_number);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);
        randomIntent.putExtra("total_count",count);
        startActivity(randomIntent);
    }
}
