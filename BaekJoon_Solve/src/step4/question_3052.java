package step4;

import java.util.Scanner;

public class question_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		int [] val = new int[42];
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt()%42;
		}
		
		for(int i=0;i<10;i++) {
			val[arr[i]] =1;
		}
		int cnt=0;
		for(int i=0;i<42;i++) {
			if(val[i]==1)
				cnt++;
		}
		
		System.out.println(cnt);

	}

}
