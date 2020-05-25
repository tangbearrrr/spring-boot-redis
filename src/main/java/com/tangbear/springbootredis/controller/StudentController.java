package com.tangbear.springbootredis.controller;

import com.tangbear.springbootredis.service.RedisService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {

    private final RedisService redisService;

    @GetMapping("/students")
    public ResponseEntity setKey() {
        return ResponseEntity.ok(redisService.setKey("1", "BB"));
    }
}
