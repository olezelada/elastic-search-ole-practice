package com.dharbor.bugz.search.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomFilterRequest {

    String userId;

    String issueType;

    String eventType;

    List<Long> sprintIdList;

}
