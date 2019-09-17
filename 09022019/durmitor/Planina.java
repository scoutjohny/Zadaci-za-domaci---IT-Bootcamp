package durmitor;

import java.util.ArrayList;
import java.util.List;

public class Planina {
	private String ime;
    private double visina; // U metrima
    private List<Planinar> planinari;

    public Planina(String ime, double visina) {
        this.ime = ime;
        this.visina = visina;
        planinari= new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public double getVisina() {
        return visina;
    }

    public void dodajPlaninara(Planinar p){
       planinari.add(p);
    }
    public void ukloniPlaninara(Planinar p) {
    	planinari.remove(p);
    }
    public Planinar getPlaninarAt(int i) {
    	if(i<0 || i>=planinari.size()) {
    		return null;
    	}
    	return planinari.get(i);
    }
    
    public int getBrPlaninara() {
    	return planinari.size();
    }
    public void ispisiPlaninare(){
        System.out.print("[ ");
        for(Planinar p : planinari){
            System.out.print(p + " ");
        }
        System.out.print("]");
    }

    @Override
    public String toString() {
        return ime + " (" + visina + ")";
    }
}
