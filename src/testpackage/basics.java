package testpackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basics {

	@AfterTest
	public void runatlast() {
		System.out.println("I will run last");
	}
	
	@BeforeSuite
	public void firstsuite() {
		System.out.println("I am no 1");
	}
	
	@AfterSuite
	public void lastinsuite() {
		System.out.println("I am no 1 from last");
	}
	
	@Test(groups= {"Smoketest"})
	public void Case2() {
		System.out.println("smoke-group-testcase2");
	}
	
	@Test
	public void Demo() {
		System.out.println("Demo print");
	}



	@Test(dependsOnMethods= {"Demo"})
	public void afc() {
		System.out.println("Alphabetically first class");
		
	}
	
	
}
