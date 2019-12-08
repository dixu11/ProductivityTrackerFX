package com.productivity;

import com.productivity.model.Record;

import java.util.ArrayList;
import java.util.List;

public class RecordManager {
    private List<Record> allRecords;

    public RecordManager() {
        allRecords = new ArrayList<>();
    }

    private void addRecord(Record record) {
        allRecords.add(record);
    }
}
