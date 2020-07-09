package com.codingwithsaani.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckEvenOrOdd objectCheckEvenOrOdd;
    boolean returnedValue;

    EditText userInputET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInputET=findViewById(R.id.userInputET);
    }

    public void checkNumber(View view)
    {
        if(!userInputET.getText().toString().isEmpty()) {
            int userInput = Integer.parseInt(userInputET.getText().toString());

            objectCheckEvenOrOdd = new CheckEvenOrOdd();
            returnedValue = objectCheckEvenOrOdd.check(userInput);

            if (returnedValue) {
                Toast.makeText(this, "Number is Even", Toast.LENGTH_LONG).show();
            } else if (!returnedValue) {
                Toast.makeText(this, "Number is Odd", Toast.LENGTH_LONG).show();
            }

            userInputET.setText("");
            userInputET.requestFocus();
        }
        else
        {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
            userInputET.requestFocus();
        }
    }
}