package com.example.myfitnesscenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Diary extends AppCompatActivity {

    private static Button breakfast;
    private static Button launch;
    private static Button dinner;
    private static Button snacks;
    private static Button water;
    private static Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        breakfast = (Button) findViewById(R.id.breakfast_addFood);
        launch = (Button) findViewById(R.id.launch_addFood);
        dinner = (Button) findViewById(R.id.dinner_addFood);
        snacks = (Button) findViewById(R.id.snacks_addFood);
        water = (Button) findViewById(R.id.water_add);
        ReturnToDiary(breakfast);
        ReturnToDiary(launch);
        ReturnToDiary(dinner);
        ReturnToDiary(snacks);
        ReturnToDiary(water);
        Settings();
    }


    public  void ReturnToDiary(Button btn)
    {

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".AddFood");
                        startActivity(intent);
                    }
                }
        );
    }

    public  void Settings()
    {
        settings = (Button) findViewById(R.id.settings_button);
        settings.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(".Settings");
                        startActivity(intent);
                    }
                }
        );
    }
}
