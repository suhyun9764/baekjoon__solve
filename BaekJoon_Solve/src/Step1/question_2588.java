package Step1;

import java.util.Scanner;

public class question_2588 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int hund = num2/100;
		int ten = (num2-hund*100)/10;
		int one = num2-(hund*100+ten*10);
		
		int[] val = {one,ten,hund};
		
		for(int i=0;i<val.length;i++) {
			System.out.println(num*val[i]);
		}
		System.out.println(num*num2);

	}

}
