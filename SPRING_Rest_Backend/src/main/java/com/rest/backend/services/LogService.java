package com.rest.backend.services;

import com.rest.backend.models.Log;
import com.rest.backend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public Page<Log> showLogsWithPagination(Pageable pageable) {
        return logRepository.findAll(pageable);
    }

    public Page<Log> findAllPageCount(Integer page, Integer count){
        Pageable pageable = PageRequest.of(page, count, Sort.Direction.DESC, "createdAt");
        return logRepository.findAll(pageable);

    }

}
