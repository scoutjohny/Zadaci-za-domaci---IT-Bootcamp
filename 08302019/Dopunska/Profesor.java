package liste;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
	private List<String> predmeti;

	public Profesor() {
		predmeti = new ArrayList<>();
	}

	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public boolean izbaciPredmet(String predmet) {
		return predmeti.remove(predmet);
	}

	public String getPredmet(int i) {
		return predmeti.get(i);
	}

	public String getPredmet(String predmet) {
		return predmeti.get(predmeti.indexOf(predmet));
	}

	public boolean hasPredmet(String predmet) {
		return predmeti.contains(predmet);
	}

	public int countPredmete() {
		return predmeti.size();
	}

	public String ispis() {
		String s = "";
		for (String predmet : predmeti) {
			s += predmet + "\n";
		}
		return s;
	}

}
