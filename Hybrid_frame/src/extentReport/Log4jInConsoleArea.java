package extentReport;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jInConsoleArea 
{
@Test
public void console()
{
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(this.getClass().getName());
	log.error("tc error");
	log.warn("warning while tc runs");
	log.info("info");
	
}
}
