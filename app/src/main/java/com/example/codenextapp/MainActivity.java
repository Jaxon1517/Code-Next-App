package com.example.codenextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button teamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamButton = (Button) findViewById(R.id.meetTeam);
        teamButton.setOnClickListener(buttonListener);


    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            teamPage();
        }
    };

    public void teamPage(View view){
        Intent intent = new Intent(MainActivity.this, AboutTeamActivity.class);
        startActivity(intent);
    }
}
