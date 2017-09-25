package com.pam.surveyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomQuestionsActivity extends AppCompatActivity {

    Button confirmButton;
    Button cancelButton;
    EditText customQuestion;
    EditText answer1;
    EditText answer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_questions);

        customQuestion = (EditText) findViewById(R.id.custom_question_text);
        answer1 = (EditText) findViewById(R.id.possible_answer1);
        answer2 = (EditText) findViewById(R.id.possible_answer2);

        confirmButton = (Button) findViewById(R.id.confirm_button);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(SurveyApp.RESULT_OK);
            }
        });
        cancelButton = (Button) findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resetIntent = new Intent(getApplicationContext(), SurveyApp.class);
                startActivity(resetIntent);
                finish();

            }
        });
    }
}
