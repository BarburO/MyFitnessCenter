package com.example.myfitnesscenter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity {

    private static Button button_run;
    private static Button button_ride;
    private static Button button_gym;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        GoToRun();
        GoToRide();
        GoToGym();
    }

    public void GoToRun() {
        button_run = (Button) findViewById(R.id.run_button);
        button_run.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Run");
                        startActivity(intent);
                    }
                }
        );


    }

    public void GoToRide() {
        button_ride = (Button) findViewById(R.id.ride_button);
        button_ride.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Ride");
                        startActivity(intent);
                    }
                }
        );


    }

    public void GoToGym() {
        button_gym = (Button) findViewById(R.id.gym_button);
        button_gym.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Gym");
                        startActivity(intent);
                    }
                }
        );


    }
}
