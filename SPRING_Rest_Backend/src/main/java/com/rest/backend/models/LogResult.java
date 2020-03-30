package com.rest.backend.models;

import java.util.List;

public class LogResult {

    private List<Log> entries;
    private Integer entry_count;

    public LogResult() {
    }

    public LogResult(List<Log> entries, Integer entry_count) {
        this.entries = entries;
        this.entry_count = entry_count;
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public Integer getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(Integer entry_count) {
        this.entry_count = entry_count;
    }
}
