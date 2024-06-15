
import java.io.IOException;

public class PowerLimit {
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		PrintWriter wr = new PrintWriter(System.out);
//		int A = Integer.parseInt(br.readLine().trim());
//		int B = Integer.parseInt(br.readLine().trim());
//		int out_ = Test(A, B);
		int out_ = Test(3, 5);
		System.out.println(out_);
//		wr.close();
//		br.close();
	}

	static int Test(int A, int B) {
		int result = 0;
		while (true) {
			if ((A >= 1) && (B >= 1)) {
				result = result + 1;
				if (A > B) {
					A = A - 2;
					B = B + 1;
				} else {
					A = A + 1;
					B = B - 2;
				}
				if ((A == 0) || (B == 0)) {
					break;
				}
			}
		}
		return result;
	}
}