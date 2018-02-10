package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Sample Test
 * @author Saurav
 *
 */
public class SampleTest2 
{
	public static Logger LOG = Logger.getLogger(SampleTest2.class);

	@Test
	public void test1()
	{
		LOG.info("test 1");
	}
	@Test(enabled=false) // disable this test.
	public void test2()
	{
		LOG.info("test 2");
	}
	@Test
	public void test3()
	{
		LOG.info("test 3");
	}
	@Test
	public void test4()
	{
		LOG.info("test 4");
	}
}
