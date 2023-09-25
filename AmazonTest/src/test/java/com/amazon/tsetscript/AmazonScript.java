package com.amazon.tsetscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandPage;
import com.amazon.pages.SingIn;

import com.amazon.pages.LandPage;

public class AmazonScript extends BaseStartApp
{
	
	@Test
	public void MouseHoveringOnSingInPage()
	{
		LandPage land = new LandPage(driver);
		land.MethodOfHovering();
		
		land.ClickOnSingIn();
		
		SingIn sing = new SingIn(driver);
		sing.fillingIntoBox("yudsjsh@gmsil.com");
		
		sing.ClickingOnBtn();
		
		
	}
	
}
