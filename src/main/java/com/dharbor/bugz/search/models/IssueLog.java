package com.dharbor.bugz.search.models;

import com.dharbor.bugz.search.constants.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = Constant.IssueLogIndex.INDEX_NAME, type = Constant.IssueLogIndex.DOC_TYPE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssueLog {

    @Id
    private Long id;

    private String newValue;

    private Long issueId;

    private Long targetNewId;

    private Long targetId;

    private String targetType;

    private String eventType;

    private String userId;

    private String issueType;

    private Long sprintId;

    private Boolean deleted;

    private String comment;

    private String oldValue;

    private Long projectId;

    private Date eventDate;

}
