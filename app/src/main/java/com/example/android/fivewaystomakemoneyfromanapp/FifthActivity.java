package com.example.android.fivewaystomakemoneyfromanapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fast on 5/16/2016.
 */
public class FifthActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_layout);
    }
    public void getBack(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Back"))
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}
