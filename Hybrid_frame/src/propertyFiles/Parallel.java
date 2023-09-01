package propertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import generic.WriteExcel;

public class Parallel 
{
	@Test
	public void test() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./Propertfile.Properties"));
		String value = p.getProperty("baseurl");
		System.out.println(value);
	}

}
 