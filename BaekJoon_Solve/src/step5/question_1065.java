package step5;

import java.util.Scanner;

public class question_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		System.out.println(calNum(a));
		

	}
	
	public static int calNum(int[] a) {
		int cnt=0;
		if(a.length<100) {
			cnt=a.length-1;
			return cnt;
		}
		else {
			cnt = 99;
			for(int i=100;i<a.length;i++) {
				int z = i;
				int[] buf = new int[4];
				int j=0;
				while(z>0) {
					buf[j]=z%10;
					z/=10;
					j++;
				
				}

				if(i==1000) ;
				else {
				if((double)buf[1]==(double)(buf[0]+buf[2])/2) {
					cnt++;
				}
			}
				
		}
			return cnt;
	}
		
	}

}
