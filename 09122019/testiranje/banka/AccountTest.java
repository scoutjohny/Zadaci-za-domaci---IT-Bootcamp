package testiranje.banka;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banka.Account;
import banka.Bank;

public class AccountTest {
	// Zad1 a/
	@Test
	public void testKonstruktor() {
		String ime = "Zlatko", brojRacuna = "0001";
		double pocVrednost = 0;
		Account acc = new Account(ime, brojRacuna);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(acc.getName(), ime, "Pogresno ime unutar kons ili getera");
		sa.assertEquals(acc.getNumber(), brojRacuna, "Pogresan broj racuna");
		sa.assertEquals(acc.getAmount(), pocVrednost, "Losa pocetna vrednost");
		sa.assertAll();

	}

	@Test
	public void testGetSet() {
		String ime = "Zlatko", brojRacuna = "0001";
		double pocVrednost = 0, novaVr = 150000;

		Account acc = new Account(ime, brojRacuna);

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(acc.getName(), ime, "Pogresno ime unutar kons ili getera");
		sa.assertEquals(acc.getNumber(), brojRacuna, "Pogresan broj racuna");
		sa.assertEquals(acc.getAmount(), pocVrednost, "Losa pocetna vrednost");
		sa.assertAll();

		acc.setAmount(novaVr);
		Double vred = novaVr;
		Assert.assertEquals(acc.getAmount(), vred, "Lose postavljeno");

	}

	@Test
	public void testNaloga() {
		int MAX=100;
		Account[] nalozi = new Account[MAX];

		for (int i = 0; i < nalozi.length; i++) {
			
			nalozi[i] = new Account("Nalog" + i);
		}

		for (int i = 0; i < nalozi.length; i++) {
			for (int j = i + 1; j < nalozi.length; j++) {
				Assert.assertNotEquals(nalozi[i].getNumber(), nalozi[j].getNumber());
			}
		}
	}
	@Test
	public void testIspis() {
		String ime="Dusan",broj="0001";
		Account acc= new Account(ime,broj);
		Assert.assertEquals(acc.toString(), String.format("%s\t%s\t%.2f",acc.getNumber(),acc.getName(),acc.getAmount()));
	}

}
