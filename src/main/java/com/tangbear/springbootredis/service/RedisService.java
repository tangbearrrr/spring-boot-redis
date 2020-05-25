package com.tangbear.springbootredis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final StringRedisTemplate template;

    public String setKey(String key, String value) {
        template.opsForValue().set(key, value);
        return "Success!";
    }
}
