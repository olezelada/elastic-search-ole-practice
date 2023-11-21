package com.dharbor.bugz.search.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomRequest {

    Long issueId;

    String userId;

    Long ProjectId;

    String issueType;

    String eventType;

    Long sprintId;

}
