package com.gyuzero.springdataredispractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void redisTest() {
        redisTemplate.opsForValue().set("foo", "bar");

        String result = (String) redisTemplate.opsForValue().get("foo");

        assertEquals("bar", result);
    }

}
