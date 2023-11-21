package com.dharbor.bugz.search.repositories;

import com.dharbor.bugz.search.models.IssueLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface IssueLogRepository extends ElasticsearchRepository<IssueLog, Long> {

    List<IssueLog> findAllByUserId(String userId);

    List<IssueLog> findAllByIssueIdAndUserIdAndProjectIdAndIssueTypeAndEventTypeAndSprintIdOrderByIdDesc(Long issueId, String userId, Long ProjectId, String issueType, String eventType, Long sprintId);

    List<IssueLog> findAllByUserIdAndIssueTypeAndEventTypeAndSprintIdInOrderByIdDesc(String userId, String issueType, String eventType, List<Long> sprintIdList);

}
