package com.example.assignment3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class QuizMainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_main_screen);


        Button btn_start;
        //add drop down for select date and time
        final Spinner quesDropdown = findViewById(R.id.spinner1);
        final Spinner timeDropdown = findViewById(R.id.spinner2);
        String[] items = new String[]{"SELECT", "5", "8","10"};
        String[] items2 = new String[]{"SELECT", "10", "20","30"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);

        quesDropdown.setAdapter(adapter);
        timeDropdown.setAdapter(adapter2);

        btn_start=findViewById(R.id.btnStartQuiz);
        btn_start.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             String noOfQuestion=quesDropdown.getSelectedItem().toString();
                                             String time=timeDropdown.getSelectedItem().toString();
                                             if (noOfQuestion=="SELECT"){
                                                 Toast toast=Toast.makeText(getApplicationContext(),"Please! Select No. of Questions",Toast.LENGTH_SHORT);
                                                 toast.show();
                                             }
                                             else if (time=="SELECT"){
                                                 Toast toast=Toast.makeText(getApplicationContext(),"Please! Select Time",Toast.LENGTH_SHORT);
                                                 toast.show();
                                             }else{
                                                 //launch quiz activity

                                                 Intent intent=new Intent(getApplicationContext(),Quiz_question_screen.class);
                                                 intent.putExtra("NoOfQues", noOfQuestion);
                                                 intent.putExtra("Time",time);
                                                 startActivity(intent);
                                             }
                                         }
                                     }
        );

    }
}