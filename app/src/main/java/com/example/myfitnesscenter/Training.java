package com.example.myfitnesscenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Training extends AppCompatActivity {

    private static Button button_log_workout;
    private static Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        GoToLogWorkout();
        GoToStart();
    }

    public void GoToLogWorkout()
    {
        button_log_workout = (Button) findViewById(R.id.new_workout_button);
        button_log_workout.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".LogNewWorkout");
                        startActivity(intent);
                    }
                }
        );
    }

    public void GoToStart()
    {
        button_start = (Button) findViewById(R.id.start_button);
        button_start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Start");
                        startActivity(intent);
                    }
                }
        );
    }
}
