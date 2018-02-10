package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
/**
 * TestNG  depends on Methods Test
 * @author Saurav
 *
 */
public class dependsOnMethodsTest
{
	public static Logger LOG = Logger.getLogger(dependsOnMethodsTest.class);

	@Test(dependsOnMethods="test5")
	public void test1() {
		LOG.info("test 1");
	}

	@Test
	public void test2() {
		LOG.info("test 2");
	}

	@Test
	public void test3() {
		LOG.info("test 3");
	}

	@Test
	public void test4() {
		LOG.info("test 4");
	}

	@Test
	public void test5() {
		LOG.info("test 5");
	}
}
