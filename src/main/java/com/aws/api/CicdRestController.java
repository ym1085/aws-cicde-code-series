package com.aws.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class CicdRestController {

    @GetMapping("/health-check")
    public ResponseEntity<?> healthCheck() {
        log.info("Health check");
        return ResponseEntity.ok("200");
    }
}