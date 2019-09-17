package superbanka;

import java.util.ArrayList;
import java.util.List;

public class Banka {
	/*
	 * Banka poseduje niz racuna,
	 * cija se duzina zadaje prilikom kreiranja banke.
	 * Racun moze da se doda i da se ukloni iz banke.
	 * Povratna vrednost je indikator uspesnosti dodavanja i uklanjanja racuna
	 * 
	 * 
	 * */
	private Racun[] racuni;
	private int br;
	public Banka(int duz) {
		racuni=new Racun[duz];
		br=0;
	}
	public boolean dodajRacun(Racun r) {
		if(br==racuni.length) {
			return false;
		}
		racuni[br]=r;
		br++;
		return true;
	}
	public boolean izbaciRacun(Racun r) {
		int pos=-1;
		for(int i=0;i<racuni.length;i++) {
			if(racuni[i]==r) {
				pos=i;
				break;
			}
		}
		if(pos==-1) {
			return false;
		}
		racuni[pos]=null;
		for(int i=pos;i<br-1;i++) {
			racuni[i]=racuni[i+1];
		}
		br--;
		racuni[br]=null;
		return true;
	}
	public String ispisi() {
		String s="";
		for(int i=0;i<br;i++) {
			s+=racuni[i].ispisi()+"\n";
		}
		return s;
	}
	
}
