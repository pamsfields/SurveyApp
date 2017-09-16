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
    private int yesCount=0;
    private int noCount=0;
    private TextView no_Counter;
    private TextView yes_Counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_app);

        mQuestionTextView= (TextView) findViewById(R.id.question_text_view);
        yes_Counter= (TextView) findViewById(R.id.yes_Counter);
        no_Counter= (TextView) findViewById(R.id.no_Counter);

        mYesButton = (Button) findViewById(R.id.yes_button);
        mYesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesCount++;
                Toast.makeText(SurveyApp.this, "Thank You!", Toast.LENGTH_SHORT).show();
                yes_Counter.setText(+Integer.toString(yesCount));
            }
        });
        mNoButton = (Button) findViewById(R.id.no_button);
        mNoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noCount++;
                Toast.makeText(SurveyApp.this, "Thank You!", Toast.LENGTH_SHORT).show();

                no_Counter.setText(++Integer.toString(noCount));
            }
        });
    }
}
