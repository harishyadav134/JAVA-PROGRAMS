import java.util.Scanner;

class factorialnumber {
	int n;
	int result = 1;

	public static void main(String[] args) {
		int result = 1;
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		for (int i = 1; i <= number; i++) {
			result = result * i;
			System.out.println(result);
		}
	}
}
