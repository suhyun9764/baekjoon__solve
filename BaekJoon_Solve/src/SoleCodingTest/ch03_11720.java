package SoleCodingTest;

import java.util.Scanner;

public class ch03_11720 {

	public static void main(String[] args) {
		/*n값 입력받기
		길이 n의 숫자를 입력받아 String형 변수 snum에 저장하기
		snum을 다시 char[]형 병수 cnum에 변환하여 저장하기
		int형 변수 sum 선언하기
		for(cNum길이 만큼 반복하기) {
			배열의 각 자릿값을 정수형으로 변환하며 sum에 더하여 누적하기
		}
		sum 출력하기
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String snum = sc.next();
		char[] cnum = snum.toCharArray();
		int sum=0;
		for(int i=0;i<cnum.length;i++) {
			//sum += cnum[i]-'0';
			sum += Character.getNumericValue(cnum[i]);
		}
		
		System.out.println(sum);
	}

}
