package com.currentContainer;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.junit.Test;

public class ConcurrentMapDemo {
	@Test
	public void concurentHashMapTest() {
		  ConcurrentMap<String,Integer> concurrentMap=new ConcurrentHashMap<String, Integer>();
		  concurrentMap.put("xxx",2222);
		  System.out.println(concurrentMap);		
	}
	@Test
	public void hashTableTest() {
		Map<String,Integer> hashtable=new Hashtable<String, Integer>();
		hashtable.put("xxx",2222);
		System.out.println(hashtable);
	}
}
