package com.w3schools.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.w3schools.utils.SeWrappers;
import com.w3schools.utils.W3Wrappers;

public class LoginTest extends SeWrappers{
	W3Wrappers w3= new W3Wrappers();
	SeWrappers se= new SeWrappers();

	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("switeesonawane10@gmail.com","Sweety@10");
			String pageTitle="My learning | W3Schools";
			String actualTitle=se.getTitle();
			Assert.assertTrue(driver.getTitle().equals(pageTitle));
			//Assert.assertEquals(actualTitle,pageTitle);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void loginWithInvalidEmail()
	{
		try
		{
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("switeesonawane11@gmail.com","Testing@123");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
