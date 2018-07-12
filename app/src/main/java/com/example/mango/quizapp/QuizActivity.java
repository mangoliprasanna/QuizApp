package com.example.mango.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        this.setTitle("Hello " +getIntent().getExtras().getString("username"));

    }

    public void submitAnswers(View view)
    {
        RadioGroup answer_set_1;
        RadioGroup answer_set_2;
        RadioGroup answer_set_3;
        RadioGroup answer_set_4;
        RadioGroup answer_set_5;
        RadioButton answer1;
        RadioButton answer2;
        RadioButton answer3;
        RadioButton answer4;
        RadioButton answer5;
        int answer_id_1;
        int answer_id_2;
        int answer_id_3;
        int answer_id_4;
        int answer_id_5;
        boolean[] results = { false, false, false, false, false };
        answer_set_1 = (RadioGroup) findViewById(R.id.answer_1);
        answer_set_2 = (RadioGroup) findViewById(R.id.answer_2);
        answer_set_3 = (RadioGroup) findViewById(R.id.answer_3);
        answer_set_4 = (RadioGroup) findViewById(R.id.answer_4);
        answer_set_5 = (RadioGroup) findViewById(R.id.answer_5);
        answer_id_1 = answer_set_1.getCheckedRadioButtonId();
        answer_id_2 = answer_set_2.getCheckedRadioButtonId();
        answer_id_3 = answer_set_3.getCheckedRadioButtonId();
        answer_id_4 = answer_set_4.getCheckedRadioButtonId();
        answer_id_5 = answer_set_5.getCheckedRadioButtonId();
        if(answer_id_1 > 0)
        {
            answer1 = (RadioButton) findViewById(answer_id_1);
            if(answer1.getText().toString().compareTo(getString(R.string.question1_option_3)) == 0)
                results[0] = true;
        }
        if(answer_id_2 > 0)
        {
            answer2 = (RadioButton) findViewById(answer_id_2);
            if(answer2.getText().toString().compareTo(getString(R.string.question2_option_3)) == 0)
                results[1] = true;
        }
        if(answer_id_3 > 0)
        {
            answer3 = (RadioButton) findViewById(answer_id_3);
            if(answer3.getText().toString().compareTo(getString(R.string.question3_option_4)) == 0)
                results[2] = true;
        }
        if(answer_id_4 > 0)
        {
            answer4 = (RadioButton) findViewById(answer_id_4);
            if(answer4.getText().toString().compareTo(getString(R.string.question4_option_4)) == 0)
                results[3] = true;
        }
        if(answer_id_5 > 0)
        {
            answer5 = (RadioButton) findViewById(answer_id_5);
            if(answer5.getText().toString().compareTo(getString(R.string.question5_option_2)) == 0)
                results[4] = true;
        }
        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
        i.putExtra("result", results);
        startActivity(i);
    }
}
