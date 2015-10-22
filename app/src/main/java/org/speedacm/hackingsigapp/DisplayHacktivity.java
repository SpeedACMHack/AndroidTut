package org.speedacm.hackingsigapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class DisplayHacktivity extends AppCompatActivity {

    // Declare Activity Variables
    private Button smallButton;
    private Button bigButton;
    private EditText elementOne;
    private EditText elementTwo;
    private EditText elementThree;
    private EditText elementFour;
    private EditText elementFive;
    private EditText elementSix;
    private EditText elementSeven;
    private EditText elementEight;

    private ArrayList<String> spinnerList;
    private ArrayAdapter spinnerAdapter;

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hacktivity);

        // Initialize Variables
        bigButton = (Button) findViewById(R.id.bigButton);
        smallButton = (Button) findViewById(R.id.smallButton);

        elementOne = (EditText) findViewById(R.id.elementOne);
        elementTwo = (EditText) findViewById(R.id.elementTwo);
        elementThree = (EditText) findViewById(R.id.elementThree);
        elementFour = (EditText) findViewById(R.id.elementFour);
        elementFive = (EditText) findViewById(R.id.elementFive);
        elementSix = (EditText) findViewById(R.id.elementSix);
        elementSeven = (EditText) findViewById(R.id.elementSeven);
        elementEight = (EditText) findViewById(R.id.elementEight);

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerAdapter.add("No Items");

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(spinnerAdapter);

        // Receive the Intent
        Intent hackTent = getIntent();

        String message = hackTent.getStringExtra(Hacktivity.EXTRA_MESSAGE);

        smallButton.setText(message);
    }

    public void Populate(View view)
    {
        String msg1 = elementOne.getText().toString();
        String msg2 = elementTwo.getText().toString();
        String msg3 = elementThree.getText().toString();
        String msg4 = elementFour.getText().toString();
        String msg5 = elementFive.getText().toString();
        String msg6 = elementSix.getText().toString();
        String msg7 = elementSeven.getText().toString();
        String msg8 = elementEight.getText().toString();



        spinnerAdapter.add(msg1);
        spinnerAdapter.add(msg2);
        spinnerAdapter.add(msg3);
        spinnerAdapter.add(msg4);
        spinnerAdapter.add(msg5);
        spinnerAdapter.add(msg6);
        spinnerAdapter.add(msg7);
        spinnerAdapter.add(msg8);


    }
}
