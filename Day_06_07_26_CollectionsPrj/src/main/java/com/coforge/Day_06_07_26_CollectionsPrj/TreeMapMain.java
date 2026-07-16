package com.coforge.Day_06_07_26_CollectionsPrj;


import java.io.Serializable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		
		
		TreeMap<Integer, Product> productMap= new TreeMap<Integer, Product>();
		productMap.put(101, new Product(101, "Laptop", 65000.00, 15));
		productMap.put(102, new Product(102, "Mouse", 799.00, 120));
		productMap.put(109, new Product(103, "Keyboard", 1499.00, 80));
		productMap.put(104, new Product(104, "Monitor", 12500.00, 25));
		productMap.put(100, new Product(105, "Printer", 9500.00, 18));
		productMap.put(106, new Product(106, "Speaker", 2999.00, 40));
		productMap.put(107, new Product(107, "Webcam", 2199.00, 35));
		productMap.put(111, new Product(108, "SSD 1TB", 5999.00, 50));
		productMap.put(119, new Product(109, "Power Bank", 1799.00, 70));
		productMap.put(103, new Product(110, "USB Hub", 999.00, 90));
		
		//System.out.println(productMap.entrySet());
		for(Entry<Integer,Product> entry:productMap.entrySet())
			System.out.println(entry);
		
		Set<Integer> set= productMap.descendingKeySet();
		for(Integer s:set)
			System.out.println(s);
		
		//complete remaining methods
		
		
		
	}

}
