package com.mallina.ramesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// initialize and read from List of integer type without generic.
		List myIntList = new LinkedList();
		myIntList.add(Integer.valueOf(0));
		Integer x = (Integer) myIntList.iterator().next();
		
		// above code can be written as below with generics
		List<Integer> myGenericIntList = new LinkedList();
		myGenericIntList.add(Integer.valueOf(0));
		Integer y = myGenericIntList.iterator().next();
		
		 final ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "A", "D", "A"));
		 alphabets.add("E");
		 ArrayList<String> alphabets1 = new ArrayList<>();
		 alphabets.removeAll(Collections.singleton("A"));
		 System.out.println(alphabets);
		 alphabets.forEach(System.out::println);		 
		 Square s = (int j) -> j*j;
		 int ans = s.calculate(5);
		 System.out.println(ans);
	}

}
 