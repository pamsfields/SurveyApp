package com.pam.surveyapp;

import android.content.Intent;
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
    private Button resultsButton;
    private TextView QuestionTextView;
    private int yesCount=0;
    private int noCount=0;
    private String noCountString;
    private String yesCountString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_app);

        QuestionTextView= (TextView) findViewById(R.id.question_text_view);

        mYesButton = (Button) findViewById(R.id.yes_button);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesCount++;
                Toast.makeText(SurveyApp.this, "Thank You!", Toast.LENGTH_SHORT).show();
                yesCountString= "@string/yes_count_text"+yesCount;
            }
        });
        mNoButton = (Button) findViewById(R.id.no_button);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noCount++;
                Toast.makeText(SurveyApp.this, "Thank You!", Toast.LENGTH_SHORT).show();
                noCountString= "@string/no_count_text"+noCount;
            }
        });
        resultsButton=(Button)findViewById(R.id.results_button);
        resultsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Start ResultsActivity
                Intent resultsIntent = new Intent(getApplicationContext(), ResultsActivity.class);
                startActivityForResult(resultsIntent, RESULT_OK);
                }
        });
    }

}
