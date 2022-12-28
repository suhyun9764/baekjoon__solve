package SoleCodingTest;

import java.util.Scanner;

public class ch03_1546 {

	public static void main(String[] args) {
		/* 변수 N에 과목의 개수 입력 받기
		 * int[]형 변수 numArr에 성적입력받기
		 * 점수를 비교하여 가장 높은 점수를 찾아 int형 변수 m에 저장
		 * (점수의 합)/m*100 = answer
		 */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numArr = new int[N];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = sc.nextInt();
		}
		long sum = 0;
		long max = 0;
		for(int i=0;i<numArr.length;i++) {
			if(max<numArr[i])
				max = numArr[i];
			sum+=numArr[i];
		}
		
		System.out.println((sum*100)/max/N);

	}

}
