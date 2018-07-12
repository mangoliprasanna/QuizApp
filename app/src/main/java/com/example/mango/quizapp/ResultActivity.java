package com.example.mango.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        this.setTitle("Results");
        boolean[] results = getIntent().getExtras().getBooleanArray("result");
        int i = 0;
        for(boolean result : results)
            if(result)
                i++;

        TextView correct = (TextView) findViewById(R.id.correct);
        TextView wrong = (TextView) findViewById(R.id.wrong);
        correct.setText((4 - i) + " Wrong");
        correct.setText(i + " Correct");
    }

    public void restart(View view)
    {
        Intent i = new Intent(ResultActivity.this, MainActivity.class);
        startActivity(i);
    }
}
