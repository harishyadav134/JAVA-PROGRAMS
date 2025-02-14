import java.util.Scanner;

class fibonacci {
	int n;

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = 6;
		System.out.println(n);
		int first = 0;
		int second = 1;
		int next;
		for (int i = 0; i <= n; i++) {
			System.out.println(first);

			next = second + first;
			first = second;
			second = next;
		}
	}
}
