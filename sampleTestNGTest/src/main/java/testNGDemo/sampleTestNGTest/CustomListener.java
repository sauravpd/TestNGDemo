package testNGDemo.sampleTestNGTest;

import org.apache.log4j.Logger;
import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.Test;

/**
 * TestNG Custom Listener Test
 * @author Saurav
 */
public class CustomListener implements IExecutionListener,ISuiteListener
{
	public static Logger LOG = Logger.getLogger(CustomListener.class);

	public void onExecutionStart()
	{
		LOG.info("onExecutionStart");	
	}
	public void onExecutionFinish() 
	{
		LOG.info("onExecutionFinish");
	}
	public void onStart(ISuite suite) 
	{
		LOG.info("onStart");
	}
	public void onFinish(ISuite suite) 
	{
		LOG.info("onFinish");
	}
}
