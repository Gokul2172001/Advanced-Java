public class SumofDistintElemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 5, 1, 8, 4, 9, 1, 5 };
		System.out.println(DistinctElemet(num));
	}
	public static int DistinctElemet(int[] result) {
//		result = 0;
//		return result;
//		int arr[] = new int[result] 
		int num = 0;
		boolean dis;
		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
			dis = true;
			for (int j = 0; j < i; j++) {
				if (result[j] == result[i]) {
					dis = false;
					break;
				}
			}
			if (dis) {
				num = num + result[i];
			}
		}
		return num;
	}
}
