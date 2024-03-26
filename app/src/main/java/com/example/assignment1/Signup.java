package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

    public void next(View view)
    {
        button=findViewById(R.id.button);
        Intent intent = new Intent(Signup.this, MainActivity.class);
        startActivity(intent);
    }
    public void shutdown(View view)
    {
        button2=findViewById(R.id.button2);
        finish();
        System.exit(0);
    }
}