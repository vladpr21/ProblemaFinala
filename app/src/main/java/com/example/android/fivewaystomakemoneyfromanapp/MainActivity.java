package com.example.android.fivewaystomakemoneyfromanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPage(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("2"))
        {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("3"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("1"))
        {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("4"))
        {
            Intent intent = new Intent(this, FourthActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("5"))
        {
            Intent intent = new Intent(this, FifthActivity.class);
            startActivity(intent);
        }
    }

}
