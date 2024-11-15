package FrameWorkPractice.PageObjects;

import org.openqa.selenium.WebDriver;

import AbstractComponents.AbstractMethods;

public class SubPage extends AbstractMethods {
WebDriver driver;
	public SubPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	public void DoSubPageActions() 
	{
		
	}

}
