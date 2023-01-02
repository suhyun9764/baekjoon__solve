package SoleCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch03_10986 {

	public static void main(String[] args) throws IOException {
		/* 변수 N에 배열의 크기를 입력받고 M에 나눌 수를 입력받는다
		 * 배열 sumArr에 구간 합 저장
		 * sumArr를 나머지 합으로 업데이트
		 * 업데이트된 sumArr의 값이 0인 인덱스의 개수를 세어 정답에 더함(나머지 합 값이 0인것은 배열0부터 해당 인덱스까지의 구간합 나머지가 0인것)
		 * 원소값이 같은 인덱스의 갯수구해서 2개를 뽑는 조합 더하기 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long [] sumArr = new long[N+1];
		st =new StringTokenizer(br.readLine());
		for(int i=1;i<N+1;i++) {
			int buf = Integer.parseInt(st.nextToken());
			sumArr[i] = sumArr[i-1] + buf;
		}
		long answer =0;
		for(int i=1;i<N+1;i++) {
			sumArr[i]%=M;
			if(sumArr[i]==0)
				answer++;
		}
		
		long[] val = new long[M];
		for(int j=0;j<M;j++) {
			for(int i=1;i<N+1;i++) {
				if(sumArr[i]==j)
					val[j]++;
			}
			if(val[j]>1) {
				long
				buf2 = (val[j]*(val[j]-1))/2;
				answer +=buf2;
			}
			
		}

		System.out.println(answer);
		
		
		
	}

}
