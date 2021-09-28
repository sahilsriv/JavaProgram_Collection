package practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		Map<String,Integer> numbers = new TreeMap<>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);
		numbers.put("five", 5);
		System.out.println(numbers);
		numbers.put("one", 11);
		System.out.println(numbers);
		if(!numbers.containsKey("one")) {
			numbers.put("one", 11);
		}
		System.out.println(numbers);
		numbers.putIfAbsent("one",12);
		System.out.println(numbers);
		for(Map.Entry<String,Integer> ent: numbers.entrySet()) {
			System.out.println(ent);
			System.out.println(ent.getKey());
			System.out.println(ent.getValue());
		}
		for(String key:numbers.keySet()) {
			System.out.println(key);
		}
		for(Integer value:numbers.values()) {
			System.out.println(value);
		}
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
		numbers.remove("three");
		System.out.println(numbers);	
	}
}
