import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
/*Napisati program koji unosi brojeve K, N, M. Program ispisuje brojeve od 
 * K do N ukljucujuci i N koji nisu deljivi brojem M. Proveriti da li je 
 * K manje od N. Ukoliko nije zameniti K i N tako da prethodni uslov 
 * bude tacan.
 * 		
 */
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Unestie jedan ceo broj: ");
		int k=sc.nextInt();
		System.out.println("Unestie drugi ceo broj: ");
		int n=sc.nextInt();
		System.out.println("Unestie treci ceo broj: ");
		int m=sc.nextInt();
		if (k<n) {
			for(int i=k;i<n;i++) {
				if(i%m!=0) {
					System.out.println(i);
				}
			}
		}else {
			if(k==n) {
				System.out.println("Prva dva uneta broja moraju biti medjusobno razliciti!");
				System.out.println("Molimo Vas da ponovo pokrenete program i unesete dva razlicita cela broja!");
			}else {
				int temp=k;
				k=n;
				n=temp;
				for(int i=k;i<n;i++) {
					if(i%m!=0) {
						System.out.println(i);
			}
			
				}
			}
		}
		

	}

}
