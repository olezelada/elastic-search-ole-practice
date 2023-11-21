package com.dharbor.bugz.search.dto.response;

import com.dharbor.bugz.search.models.IssueLog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomResponse {

    List<IssueLog> logs;
}
