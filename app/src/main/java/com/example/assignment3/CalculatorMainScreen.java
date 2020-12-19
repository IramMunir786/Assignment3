package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorMainScreen extends AppCompatActivity {

    TextView result;
    EditText num1,num2;
    int number1,number2;
    float resultValue;
    Button add,subtract,multiply,divide,equal;
    String mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main_screen);

        num1=(EditText)findViewById(R.id.Number1);
        num2=(EditText)findViewById(R.id.Number2);
        result=(TextView)findViewById(R.id.result) ;

        add=(Button)findViewById(R.id.Add);
        subtract=(Button)findViewById(R.id.Subtract);
        multiply=(Button)findViewById(R.id.Multiply);
        divide=(Button)findViewById(R.id.Divide);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1.getText().toString());
                number2 =Integer.parseInt(num2.getText().toString());
                resultValue=number1+number2;
                mytext=Float.toString(resultValue);
                result.setText(mytext);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1.getText().toString());
                number2 =Integer.parseInt(num2.getText().toString());
                resultValue=number1-number2;
                mytext=Float.toString(resultValue);
                result.setText(mytext);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1.getText().toString());
                number2 =Integer.parseInt(num2.getText().toString());
                resultValue=number1*number2;
                mytext=Float.toString(resultValue);
                result.setText(mytext);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1.getText().toString());
                number2 =Integer.parseInt(num2.getText().toString());
                resultValue=number1/number2;
                mytext=Float.toString(resultValue);
                result.setText(mytext);
            }
        });
    }
}