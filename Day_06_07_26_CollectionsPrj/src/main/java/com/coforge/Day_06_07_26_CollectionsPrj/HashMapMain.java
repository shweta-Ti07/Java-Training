package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1,"apple");
		map.put(32, "orange");
		map.put(5,"banana");
		map.put(65, "watermelon");//no insertion order
		System.out.println(map);
		
		map.put(5,"pineapple");
		System.out.println(map);
		map.put(7, "orange");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.get(7));
		
		System.out.println(map.containsKey(65));
		System.out.println(map.containsValue("orange"));
		System.out.println(map.getOrDefault(66, "no fruit"));
		System.out.println(map);
		map.put(66, "no fruit");
		System.out.println(map);
		map.replace(66, "guva");
		System.out.println(map);
		map.put(78, null);
		map.put(2,null);
		System.out.println(map);
		map.put(null, null);
		System.out.println(map);
		map.put(null, "aaaaa");
		System.out.println(map);
		System.out.println(map.get(null));
		
		Set<Entry<Integer,String>> entries=map.entrySet();
		System.out.println(entries.size());
		Iterator<Entry<Integer,String>> itr=entries.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		//complete remaining methods
		
		//complete linkedhashmap methods
		
	}

}
