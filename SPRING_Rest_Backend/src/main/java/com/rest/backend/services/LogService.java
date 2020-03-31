package com.rest.backend.services;

import com.rest.backend.models.Log;
import com.rest.backend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void addLog(Log log) {
        logRepository.save(log);
    }

    public List<Log> showLogs() {
        return logRepository.findAll();
    }



}
