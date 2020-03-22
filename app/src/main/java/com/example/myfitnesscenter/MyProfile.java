package com.example.myfitnesscenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MyProfile extends AppCompatActivity {

    private  static Button settings_button;
    private  static Button myGoals_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        GoToSettings();
        GoToMyGoals();
    }

    public  void GoToSettings()
    {
        settings_button = (Button) findViewById(R.id.settings_button);
        settings_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".GoalsSettings");
                        startActivity(intent);
                    }
                }
        );
    }

    public  void GoToMyGoals()
    {
        myGoals_button = (Button) findViewById(R.id.myGoals_button);
        myGoals_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".MyGoals");
                        startActivity(intent);
                    }
                }
        );
    }
}
