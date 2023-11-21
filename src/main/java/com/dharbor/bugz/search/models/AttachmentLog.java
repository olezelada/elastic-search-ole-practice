package com.dharbor.bugz.search.models;

import com.dharbor.bugz.search.constants.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = Constant.AttachmentLogIndex.INDEX_NAME, type = Constant.AttachmentLogIndex.DOC_TYPE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttachmentLog {

    @Id
    private Long id;

    private Long projectId;

    private Long issueId;

    private Long attachmentId;

    private String userId;

    private String action;

    private String groupName;

    private String comment;

    private Date actionDate;

    private String groupCode;

}
