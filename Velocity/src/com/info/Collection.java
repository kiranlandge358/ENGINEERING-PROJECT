package com.info;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
ArrayList<Integer>obj1= new ArrayList<Integer>();
obj1.add(13);
obj1.add(45);
obj1.add(56);
obj1.add(90);
obj1.add(34);
Collections.sort(obj1);
System.out.println(obj1);
Collections.reverse(obj1);
System.out.println(obj1);
obj1.remove(3);
System.out.println(obj1);
	}

}
