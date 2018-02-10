package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/**
 * Sample test
 * @author Saurav
 *
 */
public class SampleTest1 
{
	public static Logger LOG = Logger.getLogger(SampleTest1.class);
	
	/**
	 * before suite
	 */
	@BeforeSuite
	public void beforeSuite()
	{
		LOG.info("beforeSuite");
	}
	
	/**
	 * before class
	 */
	@BeforeClass
	public void beforeClass()
	{
		LOG.info("beforeClass");
	}
	
	/**
	 * before test
	 */
	@BeforeTest
	public void beforeTest()
	{
		LOG.info("beforeTest");
	}
	
	/**
	 * before method
	 */
	@BeforeMethod
	public void beforeMethod()
	{
		LOG.info("beforeMethod");
	}

	/**
	 * test method
	 */
	@Test
	public void test()
	{
		LOG.info("Sample test");
	}
	/**
	 * after suite
	 */
	@AfterSuite
	public void afterSuite()
	{
		LOG.info("afterSuite");
	}
	
	/**
	 * after class
	 */
	@AfterClass
	public void afterClass()
	{
		LOG.info("afterClass");
	}
	
	/**
	 * before test
	 */
	@AfterTest
	public void afterTest()
	{
		LOG.info("afterTest");
	}
	
	/**
	 * after method
	 */
	@AfterMethod
	public void afterMethod()
	{
		LOG.info("afterMethod");
	}
}
