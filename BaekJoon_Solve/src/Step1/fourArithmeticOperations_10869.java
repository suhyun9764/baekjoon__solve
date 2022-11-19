package Step1;

import java.util.Scanner;

public class fourArithmeticOperations_10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int add = A+B;
		int minus = A-B;
		int mult = A*B;
		int divide = A/B;
		int remain = A%B;
		
		System.out.println(add);
		System.out.println(minus);
		System.out.println(mult);
		System.out.println(divide);
		System.out.println(remain);

	}

}
