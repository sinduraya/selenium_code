package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
	System.out.println("tc exc started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("tc exc Success");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("tc exc Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("tc Skipped");
	}

}
