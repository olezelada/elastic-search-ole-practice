package com.dharbor.bugz.search.services;

import com.dharbor.bugz.search.models.AttachmentLog;
import com.dharbor.bugz.search.repositories.AttachmentLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentLogService {

    @Autowired
    private AttachmentLogRepository logRepository;

    public List<AttachmentLog> getAllAttachmentLogByUserId(String userId) {
        return logRepository.findAllByUserId(userId);
    }

    public List<AttachmentLog> getAllAttachmentLogByAction(String action) {
        return logRepository.findAllByAction(action);
    }

}
