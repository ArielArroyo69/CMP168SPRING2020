import java.util.Scanner;
public class PatternTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number 1...9");
		int n = input.nextInt();
		
		while ((n > 0)&&(n < 10)) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" " +j);
				}
			System.out.println();
			}
			break;
		}
	}

}
