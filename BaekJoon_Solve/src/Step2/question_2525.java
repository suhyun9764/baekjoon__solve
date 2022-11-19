package Step2;

import java.util.Scanner;

public class question_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int needM = sc.nextInt();
		int completeM=0;
		int completeH=0;
		
		if(m+needM>=60) {
			completeM= (m+needM)%60;
			completeH = h+(m+needM)/60;
			if(completeH>=24) {
				completeH = completeH%24;
			}
			
		}
		else {
			completeM = m+needM;
			completeH = h;
		}
		System.out.println(completeH+" "+completeM);
		
	}

}
