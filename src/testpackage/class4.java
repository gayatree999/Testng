package testpackage;

import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class4 {

	@Parameters({"URL"})	
	@Test
		public void Webloginhomeloan(String uname) {
			System.out.println("webloginhomePersonalloan");
			System.out.println(uname);

		}
		
		@Test(groups= {"Smoketest"})
		public void  Mobileloginhomeloan() {
			System.out.println("smoke-group-Mobile login in homeloan");
		}
		
		@Test
		public void LoginAPIhomeloan() {
			System.out.println("login using API in homeloan");
		}
}
