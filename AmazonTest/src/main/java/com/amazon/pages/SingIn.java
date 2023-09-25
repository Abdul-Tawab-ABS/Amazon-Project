package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingIn 
{
	@FindBy(id = "ap_email")
	private WebElement singin;
	
	@FindBy(id = "continue")
	private WebElement ClickOnBtn;
	
	public SingIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fillingIntoBox(String Email)
	{
		singin.sendKeys(Email);
	}
	public void ClickingOnBtn()
	{
		ClickOnBtn.clear();
	}
}

