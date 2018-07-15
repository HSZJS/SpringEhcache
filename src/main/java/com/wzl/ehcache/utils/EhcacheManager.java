package com.wzl.ehcache.utils;

import java.io.Serializable;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhcacheManager {

	private static CacheManager cacheManager = null;

	// 创建缓存管理器
	static {
		String path = EhcacheManager.class.getClassLoader().getResource("").getPath();
		cacheManager = CacheManager.create(path + "ehcache.xml");
	}

	public static void putEhcache(String catcheName, Element element) {
		// 2. 获取缓存对象
		Cache cache = cacheManager.getCache(catcheName);
		// 3. 将元素添加到缓存
		cache.put(element);
	}

	public static void removeEhcache(String catcheName, Serializable key) {
		// 2. 获取缓存对象
		Cache cache = cacheManager.getCache(catcheName);
		// 3. 删除元素
		cache.remove(key);
	}

	public static Element getEhcache(String catcheName, Serializable key) {
		// 2. 获取缓存对象
		Cache cache = cacheManager.getCache(catcheName);
		// 5. 获取缓存
		Element element = cache.get(key);
		return element;
	}

}
