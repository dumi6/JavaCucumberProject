package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks {
	
@Before
public void setUp() {
	
	System.out.println("//Enter url");
	//Enter url
}


@After
public void tearDown() {
	
	System.out.println("//close browser");
	//close browser
}




}
