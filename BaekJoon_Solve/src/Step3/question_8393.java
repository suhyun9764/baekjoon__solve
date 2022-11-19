package Step3;

import java.util.Scanner;

public class question_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lim = sc.nextInt();
		int val=0;
		for(int i=1;i<=lim;i++) {
			val +=i;
		}
		System.out.println(val);

	}

}
