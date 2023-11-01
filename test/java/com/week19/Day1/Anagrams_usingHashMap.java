package com.week19.Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams_usingHashMap {
	
	static boolean isAnagram(String a, String b) {

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (char each_map1 : a.toCharArray()) {
			map1.put(each_map1, map1.getOrDefault(each_map1, 0) + 1);
		}
		for (char each_map2 : b.toCharArray()) {
			map2.put(each_map2, map2.getOrDefault(each_map2, 0) + 1);
		}

		return map1.equals(map2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
