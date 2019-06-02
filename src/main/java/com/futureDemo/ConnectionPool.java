package com.futureDemo;


import java.util.concurrent.ConcurrentHashMap;

public class ConnectionPool {
	private ConcurrentHashMap<String, Connection> pool=new ConcurrentHashMap<String,Connection>();
	public Connection getConnect(String key) {
		Connection conn=null;
		if(pool.containsKey(key)) {
			conn=pool.get(key);
		}else {
			conn=createConnection();
		}
		
		return conn;
	}
	public Connection createConnection() {
		return new Connection();
	}
	class Connection{};	
}
