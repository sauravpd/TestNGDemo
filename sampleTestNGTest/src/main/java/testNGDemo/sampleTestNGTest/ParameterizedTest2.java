package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * TestNG Parameterized Test using annotation @DataProvider
 * @author Saurav
 *
 */
public class ParameterizedTest2 
{
	public static Logger LOG = Logger.getLogger(ParameterizedTest2.class);

	@Test(dataProvider="getData")
	public void test(String username,String password)
	{
		LOG.info("Username : "+username);	
		LOG.info("Password : "+password);
	}

	@DataProvider(name = "getData")
	public static Object[][] getUserLoginDetails() 
	{
		return new Object[][] {{"username1","password1"}, {"username2", "password2"}};
	}
}
