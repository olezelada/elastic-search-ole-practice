package com.dharbor.bugz.search.services;

import com.dharbor.bugz.search.models.IssueLog;
import com.dharbor.bugz.search.repositories.IssueLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IssueLogService {

    @Autowired
    private IssueLogRepository logRepository;

    public List<IssueLog> getCustom(Long issueId, String userId, Long projectId, String issueType, String eventType, Long sprintId){
        return logRepository.findAllByIssueIdAndUserIdAndProjectIdAndIssueTypeAndEventTypeAndSprintIdOrderByIdDesc(issueId, userId, projectId, issueType, eventType, sprintId);
    }

    public List<IssueLog> getAllIssueLog() {
        List<IssueLog> logs = new ArrayList<>();
        Iterable<IssueLog> iteLogs = logRepository.findAll();
        iteLogs.forEach(logs::add);
        return logs;
    }

    public List<IssueLog> getCustomFilter(String userId, String issueType, String eventType, List<Long> sprintIdList){
        return logRepository.findAllByUserIdAndIssueTypeAndEventTypeAndSprintIdInOrderByIdDesc(userId, issueType, eventType, sprintIdList);
    }
}
