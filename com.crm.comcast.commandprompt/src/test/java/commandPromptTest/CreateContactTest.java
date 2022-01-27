package commandPromptTest;

import org.testng.annotations.Test;

public class CreateContactTest {
@Test(groups="smokeTest")
public void create_Contact_Test() {
	System.out.println("this is a create contact test block");
}
@Test(groups="regressionTest")
public void create_Contact_With_admin_Test() {
	System.out.println("this is a create contact with admin test");
}
}
