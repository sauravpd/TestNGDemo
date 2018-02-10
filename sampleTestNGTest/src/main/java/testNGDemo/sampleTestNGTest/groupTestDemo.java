package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * testNG group test demo
 * 
 * @author Saurav
 *
 */
public class groupTestDemo {
	public static Logger LOG = Logger.getLogger(SampleTest2.class);

	@Test
	public void test1() {
		LOG.info("test 1");
	}

	@Test(groups = "smoke")
	public void test2() {
		LOG.info("test 2");
	}

	@Test
	public void test3() {
		LOG.info("test 3");
	}

	@Test(groups = "smoke")
	public void test4() {
		LOG.info("test 4");
	}

	@Test(groups = "regression")
	public void test5() {
		LOG.info("test 5");
	}
}
