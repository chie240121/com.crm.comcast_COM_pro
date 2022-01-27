package commandPromptTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CreateOrgTest {
	WebDriver driver;
@Test(groups="smokeTest")
public void create_org_Test() throws Throwable {
	
System.out.println("this is a create org test block======>"+ System.getProperty("browser"));

}

@Test(groups="regressionTest")
public void create_org_with_industry_Test() {
	System.out.println("this is a crete org with industry block");
	System.out.println("this is for jenkins");
}
}
