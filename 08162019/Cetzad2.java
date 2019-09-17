package cnp;

import java.util.Scanner;

public class Cetzad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N?");
		int n = sc.nextInt();
		double sum=0,g=0,d=1;
		double mp;
		for(int i=1;i<=n;i++) {
			/*g+=i;
			d*=i;
			mp=g/d;
			g+=i+1;
			d*=i+1;
			mp*=g/d;
			sum+=mp;
		
			 * 
			 * */
			g+=i;d*=i;
			if(i%2==0) {
				sum*=g/d;
			}else {
				sum+=g/d;
				
			}
			
		}
		System.out.println(sum);

	}

}
