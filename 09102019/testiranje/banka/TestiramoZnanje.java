package testiranje.banka;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestiramoZnanje {

 @BeforeMethod
 public void poruka() {
	 System.out.println("Dobar dan");
 }
 
 @AfterMethod
 public void poruka2() {
	 System.out.println("Laku noc");
 }

  @Test
  public void Test1() {
	  System.out.println("Test1");
	  int a=5,b=6,c;
	  c=a+b;
	  SoftAssert sa = new SoftAssert();
	  
	  sa.assertEquals(c, 11);
	  sa.assertEquals(a, 6);
	  sa.assertEquals(b, 7);
	  sa.assertAll("Pala je neka provera :'(");
	  
  }
  
  @Test
  public void Test2() {
	  System.out.println("Test2");
	  int a=5,b=6,c;
	  c=a+b;
	  if(c==11)throw new SkipException("Presakcem jer je sabiranje bazicno");
	  Assert.assertEquals(c, 12);
  }
}
