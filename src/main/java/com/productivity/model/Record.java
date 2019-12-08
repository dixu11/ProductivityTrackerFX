package com.productivity.model;

import java.time.LocalDateTime;

public class Record {

    private RecordType type;
    private LocalDateTime time;
    private String note;
    private int minutes;

    public Record(RecordType type, LocalDateTime time, String note, int minutes) {
        this.type = type;
        this.time = time;
        this.note = note;
        this.minutes = minutes;
    }

    public String getNote() {
        return note;
    }

    public int getMinutes() {
        return minutes;
    }

    public RecordType getType() {
        return type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Record{" +
                "type=" + type +
                ", time=" + time +
                ", note='" + note + '\'' +
                ", minutes=" + minutes +
                '}';
    }
}
