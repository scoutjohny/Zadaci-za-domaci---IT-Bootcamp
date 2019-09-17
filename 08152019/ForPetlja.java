package cnc;

import java.util.Scanner;

public class ForPetlja {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n:");
		int n=sc.nextInt();
		/*int br=0;
		while(br<n) {
			System.out.println("Prolaz broj "+br);
			//br=br+1;
			br+=1;
		}*/
		
		for(int br=0,sum=0;br<n;br++) {
			System.out.println("Prolaz broj "+br);
			sum+=br;
		}
		//System.out.println(sum);
	}

}
