
public class swapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		stringSwap(str1, str2);
	}

	static void stringSwap(String str1, String str2) {
		str1 = str1 + "#" + str2;
		String[] swap = str1.split("#");

		str1 = swap[1];
		str2 = swap[0];
		System.out.println("Swapped str1: " + str1);
		System.out.println("Swapped str2: " + str2);
	}

}
