package com.java.tvm.task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> o = new ArrayList<String>();
		LinkedList<String> l = new LinkedList<String>();
		o.add("din");
		o.add("nive");
		l.add("namesthe");
		l.add("aaa");
		System.out.println(o);
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(String i:o) {
			System.out.println(i);
		}
		
		}
	
}
