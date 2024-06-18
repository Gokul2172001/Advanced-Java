
public class LetterNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		int n = 3;
		Numberof(str, n);
	}

	public static void Numberof(String str, int n) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i]);
			}
		}
	}

}
