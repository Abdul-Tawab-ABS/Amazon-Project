package com.amazon.pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProducts 
{
	Actions action;
	
	@FindBy(linkText = "Laptops & Accessories")
	private WebElement HoverOnLaptopsAndAccessories;
	
	@FindBy(linkText = "Apple")
	private WebElement Clickapple;
	
	public AllProducts(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
		action = new Actions(driver);
		
	}
	public void HoverOnLaptopsAndAccessoriesBtn()
	{
		action.moveToElement(HoverOnLaptopsAndAccessories).build().perform();
	}
	public void ClickOnApple()
	{
		Clickapple.click();
	}
}

