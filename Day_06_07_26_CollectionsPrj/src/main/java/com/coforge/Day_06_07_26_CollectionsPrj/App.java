package com.coforge.Day_06_07_26_CollectionsPrj;

import java.awt.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class App {
    public static void main(String[] args) {
       LinkedList<String> namesList=new LinkedList<String>();
       namesList.add("Swapna");
       namesList.add("Amit");
       namesList.add("Priya");
       namesList.add("Priya");
//       namesList.add(null);
//       namesList.add(null);
       System.out.println(namesList);
       System.out.println("*******************");
       namesList.addFirst("Pooja");
       namesList.addLast("Keerti");//returns void
       System.out.println(namesList);
       System.out.println("--------------------");
//       Iterator<String> itr=namesList.iterator();
//       while(itr.hasNext())
//    	   System.out.println(itr.next());
       System.out.println("--------------------");
       Iterator itr=namesList.descendingIterator();
       while(itr.hasNext())
    	   System.out.println(itr.next());
       System.out.println("--------------------");
       System.out.println(namesList.element());
       System.out.println("--------------------");
       System.out.println(namesList.offer("Mona"));//returns true if object added
       System.out.println(namesList.offerFirst("Kriti"));
       System.out.println(namesList);
       
       System.out.println("Peek name or first name :"+namesList.peek());
       LinkedList<String> list= namesList.reversed();
       System.out.println(list);
       
       System.out.println("--------------------");
       Collections.sort(namesList);
       System.out.println(namesList);
       
       
       
       
       
    }
}
