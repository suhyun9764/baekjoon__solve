package SoleCodingTest;

import java.util.Scanner;

public class ch03_2018 {

	public static void main(String[] args) {
		/* N에 자연수 입력받음
		 * 투 포인터를 사용하므로 start_index, end_index 선언 및 1로 초기화
		 * sum=1, count=1(자기 자신을 나타낼 때의 경우)
		 * while(end_index!=0){
		 	if(sum==N) count증가, end_index++, sum+=end_index;  
		 	else if(sum>N) sum-=start_index, start_index++;
		 	else if(sum<N) end_index++, sum+=end_index;
		 */ 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start_index = 1;
		int end_index =1;
		int sum=1;
		int count =1;
		while(end_index!=N) {
			if(sum==N) {
				count++;
				end_index++;
				sum+=end_index;
				
			}
			else if(sum>N) {
				sum=sum-start_index;
				start_index++;
			}
			else {
				end_index++;
				sum+=end_index;
			}
				
			
		}
		System.out.println(count);
	}

}
