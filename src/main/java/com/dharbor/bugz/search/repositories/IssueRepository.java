package com.dharbor.bugz.search.repositories;

import com.dharbor.bugz.search.models.Issue;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IssueRepository extends ElasticsearchRepository<Issue, Long> {
}
