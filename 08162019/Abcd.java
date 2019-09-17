package cnp;

import java.util.Scanner;

public class Abcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n?");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(i%23==0) {
				/*System.out.println("Ovde je izvrsio break");
				break;*/
				System.out.println("Preskok!");
				continue;
				
			}
			System.out.println("Broj "+i);
		}
		
	}

}
