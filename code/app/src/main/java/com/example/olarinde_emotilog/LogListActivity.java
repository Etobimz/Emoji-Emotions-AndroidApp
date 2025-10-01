package com.example.olarinde_emotilog;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class LogListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_list);

        ListView logList = findViewById(R.id.log_list);

        ArrayAdapter<LogEntry> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, LogStorage.getLogs());
        logList.setAdapter(adapter);
    }
}
