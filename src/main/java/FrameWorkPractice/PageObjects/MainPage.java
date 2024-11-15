package FrameWorkPractice.PageObjects;

import org.openqa.selenium.WebDriver;

import AbstractComponents.AbstractMethods;

public class MainPage extends AbstractMethods {
WebDriver driver;
	public MainPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
	public void GoTo() {
		driver.get("https://www.youtube.com");
	}
	public SubPage DoMainPageActions() throws InterruptedException
	{
		Thread.sleep(5000);
		return new SubPage(driver);
		
	}
	

}
