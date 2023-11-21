package com.dharbor.bugz.search.repositories;

import com.dharbor.bugz.search.models.AttachmentLog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface AttachmentLogRepository extends ElasticsearchRepository<AttachmentLog, Long> {

    List<AttachmentLog> findAllByUserId(String userId);

    List<AttachmentLog> findAllByAction(String actionType);

}
