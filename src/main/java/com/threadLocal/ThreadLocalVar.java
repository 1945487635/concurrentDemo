package com.threadLocal;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalVar<T> {
	Map<Long,T> threadVarMap=new HashMap<Long,T>();
	public T get() {
		return threadVarMap.get(Thread.currentThread().getId());
	}
   public void set(T value) {	
	   threadVarMap.put(Thread.currentThread().getId(), value);
   }
}
