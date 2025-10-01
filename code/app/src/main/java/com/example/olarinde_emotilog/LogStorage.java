package com.example.olarinde_emotilog;

import java.util.ArrayList;
import java.util.HashMap;

public class LogStorage {
    public static ArrayList<LogEntry> logs = new ArrayList<>();

    public static void addLog(LogEntry entry) {
        logs.add(entry);
    }

    public static ArrayList<LogEntry> getLogs() {
        return logs;
    }

    public static HashMap<String, Integer> getSummary() {
        HashMap<String, Integer> summary = new HashMap<>();
        for (LogEntry entry : logs) {
            summary.put(entry.getEmotion(), summary.getOrDefault(entry.getEmotion(), 0) + 1);
        }
        return summary;
    }
}
