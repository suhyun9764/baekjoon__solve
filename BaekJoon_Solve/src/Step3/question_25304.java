package Step3;

import java.util.Scanner;

public class question_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int total =0;
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a*b;
			total += c;
		}
		
		if(total ==X)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
