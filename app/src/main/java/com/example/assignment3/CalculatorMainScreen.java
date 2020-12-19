package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorMainScreen extends AppCompatActivity {

    TextView result;

   // float resultValue;
    Button zero,one,two,three,four,five,six,seven,eight,nine,point,equal,add,subtract,multiply,divide,clear;
    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main_screen);


        result=(TextView)findViewById(R.id.result) ;

        add=(Button)findViewById(R.id.Add);
        subtract=(Button)findViewById(R.id.Subtract);
        multiply=(Button)findViewById(R.id.Multiply);
        divide=(Button)findViewById(R.id.Divide);
        point=(Button)findViewById(R.id.Point);
        equal=(Button)findViewById(R.id.Equal);
        clear=(Button)findViewById(R.id.Clear);

        zero=(Button)findViewById(R.id.Zero);
        one=(Button)findViewById(R.id.One);
        two=(Button)findViewById(R.id.Two);
        three=(Button)findViewById(R.id.Three);

        four=(Button)findViewById(R.id.Four);
        five=(Button)findViewById(R.id.Five);
        six=(Button)findViewById(R.id.Six);
        seven=(Button)findViewById(R.id.Seven);
        eight=(Button)findViewById(R.id.Eight);
        nine=(Button)findViewById(R.id.Nine);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText()=="") {
                    result.setText("");
                } else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mAddition = true;
                    result.setText(null);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText()=="") {
                    result.setText("-");
                } else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mSubtract = true;
                    result.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText()=="") {
                    result.setText("");
                } else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mMultiplication = true;
                    result.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result.getText()=="") {
                    result.setText("");
                } else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    mDivision = true;
                    result.setText(null);
                }
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + ".");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(result.getText() + "");

                if (mAddition == true) {
                    result.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    result.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    result.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    result.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }

        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
    }


}