package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // User can change the text color
        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.green));
            }
        });

        // User can change the background color of the app
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((RelativeLayout) findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.teal_700));
            }
        });

        // User can change the actual text
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is fantastic!");
            }
        });

        // Resets text color
        // Resets background color
        // Resets text
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Hello from Claude!"); // Reset text content
                ((RelativeLayout) findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.purple)); // Reset background color
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white)); // Reset text color
            }
        });

        // User can click button to change text content
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (enteredText.isEmpty()) {
                    ((TextView) findViewById(R.id.text)).setText("Enter your own text!"); // Change text content to default
                } else {
                    ((TextView) findViewById(R.id.text)).setText(enteredText); // Change text content to user input
                }
            }
        });
    }
}