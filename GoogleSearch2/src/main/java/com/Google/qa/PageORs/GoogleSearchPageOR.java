package com.Google.qa.PageORs;

import org.openqa.selenium.By;

public interface GoogleSearchPageOR {
	
	
	public By searchInputField= By.xpath("//input[@name='q' and @title='Search']");
	public By btnGoogleSearch= By.xpath("(//input[@type='submit' and @value='Google Search'])[2]");
	//public static By btnGoogleSearch= By.linkText("Google Search");
	public By resultSet= By.id("resultStats");
	
}
