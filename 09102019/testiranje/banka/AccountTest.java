package testiranje.banka;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banka.Account;

public class AccountTest {
	//Zad1 a/
  @Test
  public void testKonstruktor() {
	  String ime="Zlatko",brojRacuna="0001";
	  double pocVrednost=0;
	  Account acc= new Account(ime, brojRacuna);
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(acc.getName(), ime,"Pogresno ime unutar kons ili getera");
	  sa.assertEquals(acc.getNumber(), brojRacuna,"Pogresan broj racuna");
	  sa.assertEquals(acc.getAmount(), pocVrednost,"Losa pocetna vrednost");
	  sa.assertAll();
	  
  }
  @Test
  public void testGetSet() {
	  String ime="Zlatko",brojRacuna="0001";
	  double pocVrednost=0,novaVr=150000;
	  
	  Account acc= new Account(ime, brojRacuna);
	  
	  
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(acc.getName(), ime,"Pogresno ime unutar kons ili getera");
	  sa.assertEquals(acc.getNumber(), brojRacuna,"Pogresan broj racuna");
	  sa.assertEquals(acc.getAmount(), pocVrednost,"Losa pocetna vrednost");
	  sa.assertAll();
	  
	  acc.setAmount(novaVr);
	  Double vred=novaVr;
	  Assert.assertEquals(acc.getAmount(), vred,"Lose postavljeno");
	  
	  
  }
  
}
