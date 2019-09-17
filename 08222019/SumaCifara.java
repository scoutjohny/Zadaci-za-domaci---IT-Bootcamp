package pncpop;

public class SumaCifara {

	public static void main(String[] args) {
		int n,k;
		n=123;
		k=456;
		/*System.out.println("Suma cif broja "+n+" je "+sumCif(n));
		System.out.println("Suma cif broja "+k+" je "+sumCif(k));
		 */
		System.out.println(invParnih(n));
		System.out.println(invParnih(k));
	}
	public static int invParnih(int x) {
		int inv=0;
		while(x!=0) {
			int c=x%10;
			if(c%2==0) {
				inv*=10;
				inv+=c;
			}
			x/=10;
		}
		return inv;
	}
	public static int sumCif(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	

}
