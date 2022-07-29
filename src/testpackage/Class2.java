package testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	public void test2() {
		System.out.println("testing");
	}
	
	@Test(groups={"Smoketest"})
	public void forsmoketestgroup() {
		System.out.println("smoke-group-smoke test group");
	}
	@BeforeTest
	public void prereq() {
		System.out.println("I will execute First");
	}
	
	@Test(dependsOnMethods = {"bb","cc"})
	public void aa()
	{
		System.out.println("first");
	}
	@Test
	public void bb()
	{
		System.out.println("second");
	}
	@Test
	public void cc()
	{
		System.out.println("third");
	}
	
	@Test(enabled=false)
	public void dd()
	{
		System.out.println("forth not executed");
	}
	
	
}
