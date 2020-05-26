package com.spring.Redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/url")
@RestController
public class RedisController {

	 @Autowired
	 StringRedisTemplate redisTemplate;
}
