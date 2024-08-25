
public class AdjacentSwap {

	public static void main(String[] args) {

		String words = "I love my country";

		String adjacent = Adjs(words);

		System.out.println(adjacent);
	}

	public static String Adjs(String str) {
		
		String[] ch1 = str.split(" ");
		for (int i = 0; i < ch1.length; i++) {
			
			char[] ch = ch1[i].toCharArray();
			int j = 0;
			int rem = ch1[i].length() % 2;
			
			while ((j != ch1[i].length() - rem)) {
				char temp = ch[j];
				ch[j] = ch[j + 1];
				ch[j + 1] = temp;
				j = j + 2;
			}
			ch1[i] = new String(ch);
		}
		
		return String.join(" ", ch1);
	}

}
