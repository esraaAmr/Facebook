package com.example.splach_screen.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.splach_screen.R;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    public static final long TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(runnable,TIME);
    }
    private final Runnable runnable = () -> {
        Intent intent= new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
    };
}