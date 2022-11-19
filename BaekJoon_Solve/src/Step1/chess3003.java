package Step1;

import java.util.Scanner;

public class chess3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nowPin = new int[6];
		int[] mustPin = {1,1,2,2,2,8};
		int[] needPin = new int[6];
		
		for(int i=0;i<nowPin.length;i++) {
			nowPin[i] = sc.nextInt();
		}
		
		for(int i=0;i<needPin.length;i++) {
			needPin[i] = mustPin[i]-nowPin[i];
			System.out.printf("%d ",needPin[i]);
		}

	}

}
