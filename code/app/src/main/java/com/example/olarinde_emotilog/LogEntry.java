package com.example.olarinde_emotilog;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogEntry {
    private String emotion;
    private String timestamp;

    public LogEntry(String emotion) {
        this.emotion = emotion;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
    }

    public String getEmotion() {
        return emotion;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return emotion + " @ " + timestamp;
    }
}
