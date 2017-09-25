package com.pam.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SurveyApp extends AppCompatActivity {

    private Button mYesButton;
    private Button mNoButton;
    private Button resultsButton;
    private Button customButton;
    protected TextView QuestionTextView;
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
                Intent resultsIntent = new Intent(SurveyApp.this, ResultsActivity.class);
                startActivity(resultsIntent);
            }
        });
        customButton=(Button)findViewById(R.id.custom_button);
        customButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Start ResultsActivity
                Intent resultsIntent = new Intent(SurveyApp.this, CustomQuestionsActivity.class);
                startActivity(resultsIntent);
                Bundle questionBundle = getIntent().getExtras();
                SurveyApp.this.CustomQuestion();
            }
        });
    }
    private void CustomQuestion(Bundle questionBundle);
    Bundle questionBundle = getIntent().getExtras();
    String questionText = Bundle.getString("question");
    String answer1Text = Bundle.getString("answer1");
    String answer2Text = Bundle.getString("answer2");
    QuestionTextView.setText(questionText);
    mYesButton.setText(answer1Text);
    mNoButton.setText(answer2Text);
}
