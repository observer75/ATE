package testATE;

import ATE.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

public class TestCalculator {
  @Test
  public void TestPlus() {
	double expectedResult = 6;
	//double actualResult = Calculator.getInstance().plus(2, 4);
	Reporter.log("Asserting plus method", true);
	Assert.assertEquals(Calculator.getInstance().plus(2, 4), expectedResult);
  }
  
  @Test
  public void TestMinus() {
		double expectedResult = 2;
		//double actualResult = Calculator.getInstance().minus(4, 2);
		Reporter.log("Asserting minus method ", true);
		Assert.assertEquals(Calculator.getInstance().minus(4, 2), expectedResult);
	  }
  
  @Test
  public void TestMultiply() {
		double expectedResult = 8;
		//double actualResult = Calculator.getInstance().multiply(4, 2);
		Reporter.log("Asserting multiply method ", true);
		Assert.assertEquals(Calculator.getInstance().multiply(4, 2), expectedResult);
	  }
  
  @Test
  public void TestDivide() {
		double expectedResult = 4;
		//double actualResult = Calculator.getInstance().divide(8, 2);
		Reporter.log("Asserting divide method ", true);
		Assert.assertEquals(Calculator.getInstance().divide(8, 2), expectedResult);
	  }
  
  @Test
  public void TestGetA() {
		//double expectedResult = 4;
		//double actualResult = Calculator.getInstance().divide(8, 2);
		Calculator.getInstance().setA(4.0);
		double A = Calculator.getInstance().getA();
		Reporter.log("Asserting getA method ", true);
		//Assert.assertEquals(Calculator.getInstance().getA(4.0), expectedResult);
		Assert.assertTrue(A == 4);
	  }
  
  @Test
  public void TestGetB() {
		//double expectedResult = 4;
		//double actualResult = Calculator.getInstance().divide(8, 2);
		Calculator.getInstance().setB(4.0);
		double A = Calculator.getInstance().getA();
		Reporter.log("Asserting getB method ", true);
		//Assert.assertEquals(Calculator.getInstance().getA(4.0), expectedResult);
		Assert.assertTrue(A == 4);
	  }
}
