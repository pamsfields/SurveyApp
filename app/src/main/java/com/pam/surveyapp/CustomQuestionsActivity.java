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
    Bundle questionBundle = new Bundle();

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
                Intent confirmIntent = new Intent(CustomQuestionsActivity.this, SurveyApp.class);
                confirmIntent.putExtras(questionBundle);
                startActivity(confirmIntent);
                String newQuestion = customQuestion.getText().toString();
                String newAnswer1 = answer1.getText().toString();
                String newAnswer2 = answer2.getText().toString();
                //need to pass values into buttons/question text view in SurveyApp
                questionBundle.putString("question", newQuestion);
                questionBundle.putString("answer1", newAnswer1);
                questionBundle.putString("answer2", newAnswer2);
            }
        });
        cancelButton = (Button) findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resetIntent = new Intent(getApplicationContext(), SurveyApp.class);
                startActivity(resetIntent);
                customQuestion.getText().clear();
                answer1.getText().clear();
                answer2.getText().clear();
                finish();

            }
        });
    }
}
