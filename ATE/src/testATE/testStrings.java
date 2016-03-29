package testATE;

import ATE.Strings;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

public class testStrings {

	@Test
	public void testGetNumberOfWords()
	{
		String testString = "  One Two_Three Four   ___  gggg kjhgk efef vfvfvfv";
		int expectedResult = 8;
		Strings stringInstance = new Strings();
		int actualResults = stringInstance.getNumberOfWords(testString);
		Reporter.log(testString, actualResults);
		Assert.assertEquals(actualResults, expectedResult);
	}
}
