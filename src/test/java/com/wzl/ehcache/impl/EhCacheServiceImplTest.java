package com.wzl.ehcache.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wzl.ehcache.EhCacheService;
import com.wzl.test.base.SpringTestCase;

public class EhCacheServiceImplTest extends SpringTestCase {

	@Autowired
	private EhCacheService ehCacheService;

	@Test
	public void testGetTimestamp() throws InterruptedException {
		String t1 = ehCacheService.getTimestamp("param1");
		System.out.println(t1);
		Thread.sleep(2000);
		String t2 = ehCacheService.getTimestamp("param1");
		System.out.println(t2);
		Thread.sleep(2000);
		String t3 = ehCacheService.getTimestamp("param2");
		System.out.println(t3);
	}

}
