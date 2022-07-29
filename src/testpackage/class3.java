package testpackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class3 {
	
	@Parameters({"URL","APIKey/username"})
	@Test(groups= {"Smoketest"})
	public void Weblogincarloan(String urlname,String key) {
		System.out.println("smoke-group-weblogin carloan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(timeOut = 4000)
	public void  Mobilelogincarloan() {
		System.out.println("Mobile login page in carloan");
	}
	@Test
	public void  Mobilesignincarloan() {
		System.out.println("Mobile sign in carloan");
	}
	
	//Using the data set , that is defined at the end od this class
	@Test(dataProvider = "getData")
	public void  Mobilesignoutcarloan(String username, String password) 
	{
		System.out.println("Mobile signout in carloan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void APIcarloan() {
		System.out.println("login using API in carloan");
	}
	//@BeforeMethod
	public void Beforeeverymethod() {
		System.out.println("Before every method");
	}
	//@AfterMethod
	public void Aftereverymethod() {
		System.out.println("After every method");
	}
	@BeforeClass
	public void runfirstinclass() {
		System.out.println("run first in class3");
	}
	@AfterClass
	public void runlastinclass() {
		System.out.println("run last in class3");
	}
	
	@Test
	public void failuretest() {
		System.out.println("check");
		Assert.assertTrue(false);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - un pwd - good creadit history = row
		//2nd- un pwd- no creadit history
		//3rd- fraudulant creadit history
		
		Object[][] data = new Object[3][2];
		//1St set of data
		data[0][0] = "firstUN";
		data[0][1] = "firstPwd";
		//2nd set
		data[1][0]="secondUN";
		data[1][1]="secondPwd";
		//3rd set data
		data[2][0] = "thirdUN";
		data[2][1]="ThirdPwd";
		return data;
	}
	

}
