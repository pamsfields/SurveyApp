package com.pam.surveyapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    private Button continueButton;
    private Button resetButton;
    private TextView no_Counter;
    private TextView yes_Counter;
    private String yesCount;
    private String noCount;
    private String noCountString;
    private String yesCountString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Bundle bundle = getIntent().getExtras();
        final String noCountString = bundle.getString("noCountString");

        yes_Counter= (TextView) findViewById(R.id.yes_Counter);
        yes_Counter.setText(yesCountString);
        no_Counter= (TextView) findViewById(R.id.no_Counter);
        no_Counter.setText(noCountString);

        continueButton = (Button) findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(SurveyApp.RESULT_OK);
            }
        });
        resetButton= (Button) findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resetIntent = new Intent(getApplicationContext(), SurveyApp.class);
                startActivity(resetIntent);
                finish();
                yes_Counter.setText("Yes Counts:0");
                no_Counter.setText("No Counts:0");

            }
        });
    }
}
