package com.example.olarinde_emotilog;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        TextView summaryText = findViewById(R.id.summary_text);

        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> summary = LogStorage.getSummary();

        for (String emotion : summary.keySet()) {
            sb.append(emotion).append(": ").append(summary.get(emotion)).append("\n");
        }

        if (summary.isEmpty()) {
            summaryText.setText("No logs to be shownn yet.");
        } else {
            summaryText.setText(sb.toString());
        }
    }
}
