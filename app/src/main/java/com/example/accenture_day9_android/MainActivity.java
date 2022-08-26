package com.example.accenture_day9_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.display).equals(display.getText().toString())){
                    display.setText("");
                }
            }
        });
    }

    private void updateDisplayText(String stringToAdd){
        String oldString = display.getText().toString();
        int cursorPosition = display.getSelectionStart();
        String leftString = oldString.substring(0, cursorPosition);
        String rightString = oldString.substring(cursorPosition);
        display.setText(String.format("%s%s%s", rightString , stringToAdd , leftString));
    }

    public void oneBTN(View view){
        updateDisplayText("1");
    }

    public void twoBTN(View view){
        updateDisplayText("2");
    }

    public void threeBTN(View view){
        updateDisplayText("3");
    }

    public void fourBTN(View view){
        updateDisplayText("4");
    }

    public void fiveBTN(View view){
        updateDisplayText("5");
    }

    public void sixBTN(View view){
        updateDisplayText("6");
    }

    public void sevenBTN(View view){
        updateDisplayText("7");
    }

    public void eightBTN(View view){
        updateDisplayText("8");
    }


    public void nineBTN(View view){
        updateDisplayText("9");
    }

    public void zeroBTN(View view){
        updateDisplayText("0");
    }

}