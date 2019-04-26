package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**
 * TestNG expected exception test
 * @author Saurav
 *
 */
public class ExpectedExceptionTest
{
	public static Logger LOG = Logger.getLogger(ExpectedExceptionTest.class);
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test()
	{
		LOG.info("Expected Exception Test");
		int data=50/0;
	}
}
