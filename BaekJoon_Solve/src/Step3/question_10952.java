package Step3;

import java.util.Scanner;

public class question_10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A==0&&B==0)
				break;
			System.out.println(A+B);
		}

	}

}
