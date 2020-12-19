package com.example.assignment3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Quiz_resultcard_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_resultcard_screen);


        Intent intent = getIntent();
        Bundle args = intent.getBundleExtra("Question");
        ArrayList<Integer> questionIndex = (ArrayList<Integer>) args.getSerializable("ARRAYLIST1");

        Bundle args1 = intent.getBundleExtra("Skip");
        ArrayList<Integer> skip = (ArrayList<Integer>) args1.getSerializable("ARRAYLIST2");

        Bundle args2 = intent.getBundleExtra("answers");
        ArrayList<String> answers = (ArrayList<String>) args2.getSerializable("ARRAYLIST3");


        // int noOfQues=10;

        String [] array=getResources().getStringArray(R.array.MCQ_Answers);
        int totalQuestionAnswered=0;

        for (int i=0;i<questionIndex.size();i++){
            int index=questionIndex.get(i);
            String answer=answers.get(i);
            if (array[index].equals(answer)){

                totalQuestionAnswered=totalQuestionAnswered+1;
            }
        }

        int no=questionIndex.size()+skip.size();
        TextView totalQues=findViewById(R.id.Total_ques);
        String text="Questions Asked:      "+no;
        totalQues.setText(text);

        TextView answeredQues=findViewById(R.id.ques_answered);
        String text1="Questions Answered:      "+answers.size();
        answeredQues.setText(text1);

        TextView correctAns=findViewById(R.id.correct_answered);
        String text2="Correctly Answered:      "+totalQuestionAnswered;
        correctAns.setText(text2);

        double per=(double)((totalQuestionAnswered*100)/no);
        TextView perecentage=findViewById(R.id.percentage);
        String perecent="Percentage Obtained:  "+String.valueOf(per);
        String percent=perecent+"%";
        perecentage.setText(percent);
    }
}