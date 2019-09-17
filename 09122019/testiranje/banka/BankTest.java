package testiranje.banka;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import banka.*;

public class BankTest {
	Bank b;

	@BeforeTest
	public void initBank() {
		b = new Bank();
		System.out.println("Samo jednom!");
	}

	@BeforeMethod
	public void resetBank() {
		System.out.println("Uvek pre podTesta");
		if (b != null)
			b.reset();
		else
			initBank();
	}
	
	@Test
	public void testOpen() {
		int MAX=5;
		//Account acc[]= new Account[MAX];
		for(int i=0;i<MAX;i++) {
			//acc[i]=b.openAccount("User"+i);
			Account acs=b.openAccount("User"+i);
			Assert.assertEquals(b.getAccount(acs.getNumber()),acs);
		}
		
	}
	@Test
	public void testUplata() {
		Double MONEY=1500d;
		Account a1=b.openAccount("Acc1");
		Double AMOUNT=a1.getAmount()+MONEY;
		b.payInMoney(a1.getNumber(), MONEY);
		Assert.assertEquals(a1.getAmount(),AMOUNT);
	}
	@Test
	public void testTranfser() {
		Double MONEY=1500d;
		Account a1=b.openAccount("Acc1"),a2=b.openAccount("Acc2");
		
		Double AMOUNTFROM=a1.getAmount()-MONEY;
		Double AMOUNTTO=a2.getAmount()+MONEY;
		
		b.transferMoney(a1.getNumber(), a2.getNumber(), MONEY);
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(a1.getAmount(),AMOUNTFROM);
		sa.assertEquals(a2.getAmount(),AMOUNTTO);
		sa.assertAll("Problem u novcu!");
	}
	
}