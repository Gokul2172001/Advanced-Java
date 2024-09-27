package Arraylst;

import java.util.ArrayList;

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
		list.removeAll(list);
		System.out.println(list);
		System.out.println("!%^&*");
	}

}
