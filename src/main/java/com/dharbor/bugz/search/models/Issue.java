package com.dharbor.bugz.search.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Document(indexName = "issue")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issue {

    @Id
    private Long id;

    private String createUserId;

    private String createUserName;

    private String fixVersions;

    private String reporterName;

    private Long priorityId;

    private String sprintLabel;

    private Date devCompletedDate;

    private Long fixedAtSprintId;

    private String bugTypeLabel;

    private Integer storyPoints;

    private String priorityLabel;

    private Date inSprintDate;

    private String updateUserId;

    private String updateUserName;

    private Integer qaEstimatedMinutes;

    private Long sprintId;

    private Integer totalMinutesLogged;

    private String qaAssignedId;

    private Long natureId;

    private String issueStatusLabel;

    private String projectName;

    private Long projectId;

    private Date qaAssignedDate;

    private Long resolutionId;

    private Date updateDate;

    private String code;

    private Date resolutionDate;

    private String fixedAtSprintLabel;

    private String description;

    private Long occurrenceId;

    private String title;

    private String natureLabel;

    private String resolutionLabel;

    private Date qaCompletedDate;

    private Long issueTypeId;

    private Date devAssignedDate;

    private Long environmentId;

    private Date reporterDate;

    private Boolean isReproducedStep;

    private String devAssignedId;

    private Long moduleId;

    private String moduleLabel;

    private Date createDate;

    private String devAssignedLabel;

    private Long defaultAttachmentId;

    private String qaAssignedLabel;

    private Long issueStatusId;

    private String issueTypeLabel;

    private String occurrenceLabel;

    private Boolean deleted;

    private String environmentLabel;

    private Integer devEstimatedMinutes;

    private String reporterId;

    private Long bugTypeId;

    private String affectedVersions;

}
