
public class OddAndEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Count(arr);
	}

	public static void Count(int[] arr) {
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenCount = evenCount + 1;
			else
				oddCount = oddCount + 1;
		}
		System.out.println("Number of Even Elements: " + evenCount);
		System.out.println("Number of Odd Elements: " + oddCount);

	}
}
