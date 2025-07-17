import java.util.ArrayList;

public class commonChar {

	public static ArrayList arr = new ArrayList<String>();

//	System.out.println(arr);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "cook", "cake", "peacock" };
//		String str[] = { "apple", "apricote", "grape" };
//		String str[] = { "hello", "world", "hello" };
//		String str[] = { "abc", "def", "ghi" };
		char[] arr1 = str[0].toCharArray();
		if (str.length >= 1) {
			for (int i = 1; i < str.length; i++) {
				compare(arr1, str[i].toCharArray());
				arr1 = new char[arr.size()];
				for (int j = 0; j < arr.size(); j++) {
					arr1[j] = (char) arr.get(j);
				}
			}
//			System.out.println(arr);
		} else {

		}
		removeDuplicate(arr);
		System.out.println(arr);

	}

	public static void compare(char[] cha1, char[] cha2) {
		for (int i = 0; i < cha1.length; i++) {
			for (int j = 0; j < cha2.length; j++) {
				if (cha1[i] == cha2[j]) {
					arr.add(cha1[i]);
				}
			}
		}
	}

	public static void removeDuplicate(ArrayList arr) {
		for (int i = 0; i < arr.size(); i++) {
			int j = i + 1;
			while (j < arr.size()) {
				if (arr.get(i).equals(arr.get(j))) {
					arr.remove(j);
				} else
					j++;
			}
		}
	}

}
