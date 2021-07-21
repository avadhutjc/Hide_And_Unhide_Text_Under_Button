package com.masai.myapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hide extends AppCompatActivity {

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide);
        b1 = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView);
        String text = b1.getText().toString();
    }

    public void hide(View view) {
        String text = b1.getText().toString();
        if (text.equals("Hide")) {
            t1.setVisibility(View.INVISIBLE);
            b1.setText("Unhide");
        } else if (text.equals("Unhide")) {
            t1.setVisibility(View.VISIBLE);
            b1.setText("Hide");
        }
    }

}

