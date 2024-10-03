package Arraylst;

import java.util.ArrayList;
import java.util.Collections;

public class basicsArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Andrews");
		list.add("Mark");
		list.add("Gensles");
		list.add("Drelogo");
//		System.out.println(String.valueOf(0));
		System.out.println(list);
		System.out.println(list.equals("Andrews"));
		System.out.println(list.remove(2));
		System.out.println(list);
		list.add(2, "Gensles");
		System.out.println(list);
		int size = list.lastIndexOf("Drelogo");
		System.out.println(size);
//		list.removeAll(list);
//		System.out.println(list);
		System.out.println("!%^&*");

		// iteration through all the elements

		for (String ele : list) {
			System.out.println(ele);
		}

		// add new element at the first position

		list.add(0, "Angel");
		System.out.println(list);

		// retrieve an element from the certain index

		System.out.println(list.get(1) + " is the second element");

		// remove the certain element from the index

		list.remove(1);
		if (list.get(3) != "Mark") {
			System.out.println("3rd element isn't Mark but " + list.get(3));
		}

		// element search
		if (list.contains("Mark")) {
			System.out.println("Element found");
		} else {
			System.out.println("Not found");
		}

		// sort

		System.out.println("Before sorting " + list);

		Collections.sort(list);

		System.out.println("After sorting" + list);

		// Copy Array

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");

		System.out.println("before copy" + list + list1);
		Collections.copy(list, list1);

		System.out.println("after copy" + list + list1);

		System.out.println("Before shuffle" + list1);

		Collections.shuffle(list1);

		System.out.println("After shuffle" + list1);

		Collections.sort(list1);

		System.out.println("before reversing" + list1);

		Collections.reverse(list1);

		System.out.println("After reversing" + list1);

//		ArrayList<String> list1 = list1.subList(0, 3);

		ArrayList<String> li1 = new ArrayList<String>();
		ArrayList<String> li2 = new ArrayList<String>();

		li1.add("Apple");
		li1.add("Apple");
		li1.add("Apple");
		li1.add("Apple");
		li1.add("Apple");

		li2.add("Apple");
		li2.add("Apple");
		li2.add("Apple");
		li2.add("Apple");
		li2.add("Apple");

		ArrayList<String> li3 = new ArrayList<String>();

		for (String e : li1) {

		}
	}

}
