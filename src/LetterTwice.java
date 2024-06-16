
public class LetterTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		twice(str);
	}

	public static void twice(String str) {
		char[] arr = str.toCharArray();
//		char[] arr1 = str.toCharArray();
//		char[] arr3;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(arr[i]);
		}
	}

}
