package com.wzl.ehcache.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.wzl.ehcache.EhCacheService;

@Service
public class EhCacheServiceImpl implements EhCacheService {

	@Cacheable(value = "HelloWorldCache", key = "#param")
	public String getTimestamp(String param) {
		Long timestamp = System.currentTimeMillis();
		return timestamp.toString();
	}

}
