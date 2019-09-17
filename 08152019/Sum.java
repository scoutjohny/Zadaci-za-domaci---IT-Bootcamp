package cnc;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Napisati program koji pomocu for petlje
		//sumira brojeve od 1 do N ukljucjuci i N
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}

}
