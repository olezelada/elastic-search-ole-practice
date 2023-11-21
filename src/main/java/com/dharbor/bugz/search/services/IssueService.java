package com.dharbor.bugz.search.services;

import com.dharbor.bugz.search.models.Issue;
import com.dharbor.bugz.search.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueService {

    @Autowired
    private IssueRepository issueRepository;

    public Issue getIssueById(Long id) {
        return issueRepository.findById(id).get();

        issueRepository.save(Issue);

    }



}

