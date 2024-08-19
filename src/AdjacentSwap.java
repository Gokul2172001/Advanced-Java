
public class AdjacentSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "No Loves";

//		System.out.println(words);
//		System.out.println(words.trim());
		String[] word = words.split(" ");

		for (int i = 0; i < word.length; i++) {
//			System.out.println(word[i]);
			Adjacent(word[i]);
//			Adjs(word[i]);
		}

//		System.out.print(word);
	}

	public static void Adjacent(String str) {
		char[] ch = str.toCharArray();
		char[] vh = new char[ch.length];
		int val = 0;
		int div = ch.length / 2;
		System.out.println(div);
		if (ch.length != 1)
			for (int i = 0; i < ch.length / 2; i++) {
				vh[val] = ch[val + 1];
				vh[val + 1] = ch[val];
				val = val + 2;
			}
		for (int i = 0; i < vh.length; i++) {
			System.out.print(vh[i]);
		}
		if (ch.length % 2 == 1) {
			System.out.print(ch[ch.length - 1]);
		}
//		return "";
	}

	public static void Adjs(String str) {
		char[] ch = str.toCharArray();
		int len = ch.length;
		int rem = ch.length % 2;
		System.out.print(rem);
		char[] vh = new char[len];
		while (len != rem) {
			System.out.print(ch[]);
		}

	}

}
