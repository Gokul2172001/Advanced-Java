
public class mathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ran = Math.random();

		int min = 1;
		int max = 100;

		int random = min + (int) ran * (max - min);

		System.out.println(random);
		System.out.println(ran);

		System.out.println(max - min);
		System.out.println(ran * (max - min));
		System.out.println((int) ran * (max - min));
		System.out.println(min + (int) (ran * (max - min)));
		
		public int  random(Int num) {
			
		}

	}

}
