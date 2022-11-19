package Step2;

import java.util.Scanner;

public class question_2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int sec = sc.nextInt();
		int third = sc.nextInt();
		int total =0;
		int max=0;
		
		if(first==sec) {
			if(sec==third)
				total = 10000+sec*1000;
			else
				total = 1000+sec*100;
		}
		else if(first==third) 
			total = 1000+first*100;
		
		else if(sec==third)
			total = 1000+sec*100;
		
		else {
			max = first;
			if(max<sec) {
				max = sec;
				if(sec<third)
					max = third;
			}
			else if(max<third)
				max = third;
			
			total = max*100;
		}
		
		System.out.println(total);
			
	}

}
