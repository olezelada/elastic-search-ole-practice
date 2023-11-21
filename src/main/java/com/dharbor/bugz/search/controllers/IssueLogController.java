package com.dharbor.bugz.search.controllers;

import com.dharbor.bugz.search.dto.request.CustomFilterRequest;
import com.dharbor.bugz.search.dto.request.CustomRequest;
import com.dharbor.bugz.search.dto.response.CustomResponse;
import com.dharbor.bugz.search.models.IssueLog;
import com.dharbor.bugz.search.services.IssueLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/issueLog")
@RestController
public class IssueLogController {

    @Autowired
    private IssueLogService logService;

    @GetMapping
    public List<IssueLog> getIssueLogByUserId() {
        return logService.getAllIssueLog();
    }

    @GetMapping(value = "/custom")
    public CustomResponse getCustomIssueDefault(@RequestBody CustomRequest request) {
        CustomResponse response = new CustomResponse();
        Long issueId = request.getIssueId();
        String userId = request.getUserId();
        Long projectId = request.getProjectId();
        String issueType = request.getIssueType();
        String eventType = request.getEventType();
        Long sprintId = request.getSprintId();

        response.setLogs(logService.getCustom(issueId, userId, projectId, issueType, eventType, sprintId));
        return response;
    }

    @GetMapping(value = "/custom-filter")
    public CustomResponse getCustomFilterIssueDefault(@RequestBody CustomFilterRequest request) {
        CustomResponse response = new CustomResponse();
        response.setLogs(logService.getCustomFilter(request.getUserId(), request.getIssueType(), request.getEventType(), request.getSprintIdList()));
        return response;
    }

}
