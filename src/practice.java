public class practice {

	public static void main(String[] args) {

		Solution s1 = new Solution();
		int[] digit = { 1, 2 };
		System.out.println(s1.plusOne(digit));
	}
}
//		int target = 7;
//		System.out.println(s1.searchInsert(num, target));

class Solution {
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newDigit = new int[n + 1];
		newDigit[0] = 1;
		return newDigit;
	}
}
