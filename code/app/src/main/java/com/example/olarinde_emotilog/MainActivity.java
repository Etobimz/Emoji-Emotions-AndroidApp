package com.example.olarinde_emotilog;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button happy = findViewById(R.id.button_happy);
        Button sad = findViewById(R.id.button_sad);
        Button angry = findViewById(R.id.button_angry);
        Button excited = findViewById(R.id.button_excited);

        Button viewLogs = findViewById(R.id.button_view_logs);
        Button viewSummary = findViewById(R.id.button_view_summary);

        happy.setOnClickListener(v -> LogStorage.addLog(new LogEntry("Happy")));
        sad.setOnClickListener(v -> LogStorage.addLog(new LogEntry("Sad")));
        angry.setOnClickListener(v -> LogStorage.addLog(new LogEntry("Angry")));
        excited.setOnClickListener(v -> LogStorage.addLog(new LogEntry("Excited")));

        viewLogs.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LogListActivity.class)));

        viewSummary.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, SummaryActivity.class)));
    }
}
