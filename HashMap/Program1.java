package com.HashMap;

import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<>();
		System.out.println(map);
		map.put(30, 1);
		map.put(20, 3);
		map.put(10, 2);
		System.out.println(map);
		System.out.println(map.get(10));

	}

}
