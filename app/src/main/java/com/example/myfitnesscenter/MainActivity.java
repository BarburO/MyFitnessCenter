package com.example.myfitnesscenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_login;
    private static Button button_diary;
    private static Button button_training;
    private static Button button_myProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogInOnClickListener();
        DiaryOnClickListener();
        TrainingOnClickListener();
        MyProfileOnClickListener();
    }

    public void LogInOnClickListener() {
        button_login = (Button) findViewById(R.id.main_login_button);
        button_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".ui.login.LoginActivity");
                        startActivity(intent);
                    }
                }
        );


    }

    public  void  DiaryOnClickListener()
    {
        button_training = (Button) findViewById(R.id.diary_button);
        button_training.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Diary");
                        startActivity(intent);
                    }
                }
        );
    }

    public  void  TrainingOnClickListener()
    {
        button_training = (Button) findViewById(R.id.training_button);
        button_training.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Training");
                        startActivity(intent);
                    }
                }
        );
    }

    public  void  MyProfileOnClickListener()
    {
        button_myProfile = (Button) findViewById(R.id.myProfile_button);
        button_myProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".MyProfile");
                        startActivity(intent);
                    }
                }
        );
    }
}
