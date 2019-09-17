package pncpop;

public class Funkcije {

	public static void main(String[] args) {
		dobarDan();
		dobarDan();
		dobarDan();
		int a=5,b=9;
		ispisiProm(a);
		int pom=saberi(a,b);
		ispisiProm(pom);
	}
	public static void dobarDan() {
		System.out.println("Hello World!");
	}
	public static void ispisiProm(int x) {
		System.out.println(x);
	}
	public static int saberi(int x,int y){
		int c;
		c=x+y;
		x=10;
		return c;		
	}
}
