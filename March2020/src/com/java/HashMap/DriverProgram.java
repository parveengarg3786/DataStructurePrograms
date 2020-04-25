package com.java.HashMap;

public class DriverProgram {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("parveen", 10);
		hm.put("harsh", 20);
		hm.put("harsh", 30);
		hm.get("parveen");
		hm.get("harsh");
	}
}
