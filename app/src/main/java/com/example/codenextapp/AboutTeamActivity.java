package com.example.codenextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.content.*;
public class AboutTeamActivity extends AppCompatActivity {
    Button teamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_team);
        teamButton = (Button) findViewById(R.id.meetTeam);
//        teamButton.setOnClickListener(buttonListener);


    }
}

//    private View.OnClickListener buttonListener = new View.OnClickListener() {
//        public void onClick(View v) {
//            teamPage();
//        }
//    };
//
//    public void teamPage(View view){
//        Intent intent = new Intent(MainActivity.this, AboutTeamActivity.class);
//        startActivity(intent);
//    }
//}
