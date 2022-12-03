package step5;

public class fdd {

	public static void main(String[] args) {
		
		for(int i=100;i<120;i++) {
			int z = i;
			int[] buf = new int[4];
			int j=0;
			while(z>0) {
				System.out.println("z:"+z);
				buf[j]=z%10;
				z/=10;
				j++;
			}
			
			for(int a=0;a<buf.length;a++) {
				System.out.println(buf[a]);
			}
			
			System.out.println("---"+i+"----");
	}

}
}
