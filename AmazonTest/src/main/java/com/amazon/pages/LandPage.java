package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandPage 
{
	Actions action;

	@FindBy(id = "nav-tools")
	private WebElement clickSing;
	
	@FindBy(linkText = "Sign in")
	private WebElement singIn;
	
	@FindBy(linkText ="Mobiles")
	private WebElement ClickMobile;
	
	public LandPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	public void MethodOfHovering()
	{
		action.moveToElement(clickSing).build().perform();
	}
	public void ClickOnSingIn()
	{
		singIn.click();
	}
	public void ClickOnMobileBtn()
	{
		ClickMobile.click();
	}

}
