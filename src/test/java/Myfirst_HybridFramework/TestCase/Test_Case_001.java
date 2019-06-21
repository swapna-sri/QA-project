

package Myfirst_HybridFramework.TestCase;
//import java.io.IOException;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Myfirst_HybridFramework.PageObjects.LoginPage;




public class Test_Case_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws IOException 
	{
		driver.get(baseURL);

			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		logger.info("clicked on submit");
		
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			
			Assert.assertTrue(false);
			captureScreen(driver,"loginTest");
			logger.info("Login test failed");
			
		}
		
	}
}
