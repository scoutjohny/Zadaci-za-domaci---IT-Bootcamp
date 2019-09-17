package liste;
import java.util.ArrayList;
import java.util.List;
public class Dopunska {

	public static void main(String[] args) {
		List<String> brojevi= new ArrayList<>();
		brojevi.add("mata");
		brojevi.add("Prog");
		brojevi.add("OET");
		brojevi.add("Fizicko");
		//System.out.println(brojevi.get(3));
		/*for(String s:brojevi) {
			System.out.println();
		}*/
		//System.out.println(brojevi.get(3) +" "+brojevi.get(1));
		
		System.out.println(brojevi.get(brojevi.indexOf("mata")));
	}

}









