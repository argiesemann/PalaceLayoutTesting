package com.example.palacelayouttesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardSurfaceView csv = findViewById(R.id.CardSurfaceView);
        csv.invalidate();


    }
}
