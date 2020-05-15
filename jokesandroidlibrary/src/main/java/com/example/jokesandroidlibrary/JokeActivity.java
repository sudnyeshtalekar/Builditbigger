package com.example.jokesandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent jokeIntent = getIntent();
        String joke = jokeIntent.getStringExtra("joke");

        TextView jokeText = findViewById(R.id.jokeText);
        jokeText.setText(joke);
    }
}
