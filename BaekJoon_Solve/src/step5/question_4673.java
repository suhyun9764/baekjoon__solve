package step5;

public class question_4673 {

	public static void main(String[] args) {
		int[] a = new int[10001];
		selfNum(a);
		

	}
	
	public static void selfNum(int[] a){		
		for(int i=0;i<10001;i++) {
			int n = i+numSum(i);
			if(n<=10000)
				a[n] = 1;
		}
		
		for(int i =1;i<10001;i++) {
			if(a[i]!=1)
				System.out.println(i);
		}
		
	}
	
	public static int numSum(int num) {
		int sum =0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
}
