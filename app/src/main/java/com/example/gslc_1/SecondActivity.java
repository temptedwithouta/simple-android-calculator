package com.example.gslc_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView input, output;
    private Button buttonDot, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonPercent, buttonClear, buttonOff, buttonEqual, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonDot = findViewById(R.id.buttonDot);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonClear = findViewById(R.id.buttonClear);
        buttonOff = findViewById(R.id.buttonOff);
        buttonEqual = findViewById(R.id.buttonEqual);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        input = findViewById(R.id.input);
        output = findViewById(R.id.output);

        Button[] buttons = new Button[]{buttonDot, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonPercent, buttonClear, buttonOff, buttonEqual, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9};

        for(int i = 0; i < buttons.length; i++){
            buttons[i].setOnClickListener(this);
        }

        buttonOff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button0){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "0");
        }
        else if(v.getId() == R.id.button1){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "1");
        }
        else if(v.getId() == R.id.button2){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "2");
        }
        else if(v.getId() == R.id.button3){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "3");
        }
        else if(v.getId() == R.id.button4){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "4");
        }
        else if(v.getId() == R.id.button5){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "5");
        }
        else if(v.getId() == R.id.button6){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "6");
        }
        else if(v.getId() == R.id.button7){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "7");
        }
        else if(v.getId() == R.id.button8){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "8");
        }
        else if(v.getId() == R.id.button9){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + "9");
        }
        else if(v.getId() == R.id.buttonAdd){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + " + ");
        }
        else if(v.getId() == R.id.buttonSubtract){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + " - ");
        }
        else if(v.getId() == R.id.buttonMultiply){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + " x ");
        }
        else if(v.getId() == R.id.buttonDivide){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + " ÷ ");
        }
        else if(v.getId() == R.id.buttonPercent){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + " % ");
        }
        else if(v.getId() == R.id.buttonDot){
            String inputDisplay = (String)input.getText();

            input.setText(inputDisplay + ".");
        }
        else if(v.getId() == R.id.buttonEqual){
            String inputDisplay = (String)input.getText();
            Double total = calculate(inputDisplay);

            String outputDisplay = String.valueOf(total);

            output.setText(outputDisplay);
        }
        else if(v.getId() == R.id.buttonClear){
            String inputDisplay = (String)input.getText();

            input.setText("");

            output.setText("");
        }
    }

    private double calculate(String expression) {
        String[] tokens = expression.split(" ");

        if(tokens.length != 3){
            return 0;
        }

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);

        char operator = tokens[1].charAt(0);

        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case 'x':
                return operand1 * operand2;
            case '÷':
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            default:
                return 0;
        }
    }
}