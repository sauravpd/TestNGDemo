package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * TestNG Parameterized Test using annotation @Parameters
 * @author Saurav
 *
 */
public class ParameterizedTest1 
{
	public static Logger LOG = Logger.getLogger(ParameterizedTest1.class);
	
	@Test
	@Parameters("country")
	public void test(String country)
	{
		LOG.info("Parameterized value : "+country);	
	}
}
