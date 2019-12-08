package com.productivity.controller.service;

import com.productivity.model.Record;
import com.productivity.model.RecordType;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

import static com.productivity.controller.service.RecordAddingResult.SUCCESS;

public class RecordService extends Service<RecordAddingResult> {

    private Record record;

    public RecordService(Record record) {
        this.record = record;
    }


    private RecordAddingResult addRecord() {
        RecordAddingResult result;
        if ((result = validateTime()) != SUCCESS) {
            return result;
        }
        System.out.println("Added " + record);
        return SUCCESS;
    }

    @Override
    protected Task<RecordAddingResult> createTask() {
        return new Task<RecordAddingResult>() {
            @Override
            protected RecordAddingResult call() throws Exception {
                return addRecord();
            }
        };
    }

    private RecordAddingResult validateTime() {
        final int DAY = 60 * 24;
        if (record.getMinutes() < DAY && record.getMinutes() > 0) {
            return SUCCESS;
        }
        return RecordAddingResult.WRONG_TIME_RANGE;
    }
}
