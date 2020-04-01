package com.rest.backend.models;

import java.util.List;

public class PageList {

    private List<Log> entries;
    private long entry_count;

    public PageList() {
    }

    public PageList(List<Log> logs, long entry_count) {
        this.entries = logs;
        this.entry_count = entry_count;
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public long getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(long entry_count) {
        this.entry_count = entry_count;
    }
}
