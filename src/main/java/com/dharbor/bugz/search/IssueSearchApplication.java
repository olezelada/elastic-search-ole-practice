package com.dharbor.bugz.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class IssueSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(IssueSearchApplication.class, args);
    }
}
