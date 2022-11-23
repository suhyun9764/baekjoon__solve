package step4;

import java.util.Scanner;

public class question_4344 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i=0;i<C;i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int total =0;
			int cnt=0;
			for(int j=0;j<N;j++) {
				arr[j] = sc.nextInt();
				total +=arr[j];
			}
			int avg = total/N;
			
			for(int k=0;k<N;k++) {
				if(arr[k]>avg)
					cnt++;
			}
			double val = 100*(double)cnt/N;
			System.out.printf("%.3f%%\n",val);
			
		}
		

	}

}
