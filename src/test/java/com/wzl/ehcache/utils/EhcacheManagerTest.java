package com.wzl.ehcache.utils;

import org.junit.Test;

import net.sf.ehcache.Element;

public class EhcacheManagerTest {

	public static final String CACHE_NAME = "HelloWorldCache";

	@Test
	public void testPutEhcache() {
		Element element = new Element("key1", "value1");
		EhcacheManager.putEhcache(CACHE_NAME, element);
	}

	@Test
	public void testRemoveEhcache() {
		EhcacheManager.removeEhcache(CACHE_NAME, "key1");
	}

	@Test
	public void testGetEhcache() {
		// put
		Element element1 = new Element("key1", "value1");
		EhcacheManager.putEhcache(CACHE_NAME, element1);
		// get
		Element element2 = EhcacheManager.getEhcache(CACHE_NAME, "key1");
		System.out.println(element2.getObjectValue());
	}

}
