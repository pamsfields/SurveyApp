package com.pam.surveyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SurveyApp extends AppCompatActivity {

    private Button mYesButton;
    private Button mNoButton;
    private TextView mQuestionTextView;
    //private Int yesCount;
    //private Int noCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_app);

        mYesButton = (Button) findViewById(R.id.yes_button);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Need to add a counter to this portion, something like yesCount++;
            }
        });
        mNoButton = (Button) findViewById(R.id.no_button);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Need to add a counter to this portion, something like noCount++;
            }
        });
    }
}
