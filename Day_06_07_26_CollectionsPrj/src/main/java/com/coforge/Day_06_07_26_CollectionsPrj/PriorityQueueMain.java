package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(87);
		pq.add(76);
		pq.add(34);
		pq.add(25);
		pq.add(88);
		pq.add(9);
		pq.add(34);
		pq.add(25);
		
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
		System.out.println(pq.offer(10));
		System.out.println(pq);
		System.out.println(pq.poll());
		
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq);

		//complete rest of priority queue and arraydeque
		
		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		ad.add(89);
		ad.add(67);
		ad.addFirst(45);//void
		ad.addLast(34);
		
		ad.offerFirst(67);//boolean

	}

}
