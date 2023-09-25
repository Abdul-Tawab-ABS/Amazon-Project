package com.amazon.tsetscript;

import org.testng.annotations.Test;

import com.amazon.pages.AllProducts;
import com.amazon.pages.LandPage;

public class BuyingMobilePhone extends BaseStartApp
{
	@Test
	public void BuyMobilePhoneFromAmazon()
	{
		LandPage mobile = new LandPage(driver);
		mobile.ClickOnMobileBtn();
		
		AllProducts hover = new AllProducts(driver);
		hover.HoverOnLaptopsAndAccessoriesBtn();
		
		hover.ClickOnApple();
	}
}
