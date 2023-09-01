package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RunnerClass 
{
@Test
public void test1()
{
	System.out.println("hello Banglore");
}
@Test
public void test2()
{
	System.out.println("hello India");
	Assert.fail();
}
@Test(dependsOnMethods = "test2")
public void test3()
{
	System.out.println("hello Asia");
}
}
