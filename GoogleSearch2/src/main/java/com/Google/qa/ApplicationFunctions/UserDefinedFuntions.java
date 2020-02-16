package com.Google.qa.ApplicationFunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Google.qa.PageORs.GoogleSearchPageOR;
import com.Google.qa.base.TestBase;
import com.Google.qa.utilities.TestUtil;

public class UserDefinedFuntions extends TestBase{

	
/*
 * FunctionName: fngetTitleOfThePage 
 * Parameters: No
 * Use of the function: Function for getting the title of the pages opened in the browser
 * Author: Utkarsh Pratap Singh
 * Date: 12 FEB 2020
 */	
	
	public String fngetTitleOfThePage() {
		
		String title= driver.getTitle();
		
		return title;
	}

	

/* FunctionName: fnCloseCurrentBrowser 
 * Parameters: No
 * Use of the function: Function for closing the current browser
 * Author: Utkarsh Pratap Singh
 * Date: 12 FEB 2020
 */		
	
	public void fnCloseCurrentBrowser() {
		
		driver.close();
		
	}
		

	

/* FunctionName: enterValueInField 
 * Parameters: Yes
 * 			-By elementXpath= xpath of the element
 * 			-String valueToEnter= value to enter in the field
 * 			-Object extraArgument= Future use
 * Use of the function: Function for enter the value in the field
 * Author: Utkarsh Pratap Singh
 * Date: 12 FEB 2020
 */	
	
	public void enterValueInField(By elementXpath,String valueToEnter,Object extraArguments) {
		
		driver.findElement(elementXpath).sendKeys(valueToEnter);
		
	}
	
	
	
/* FunctionName: fnGoogleNameSearching 
 * Parameters: Yes
 * 		-String totelIteration = total number of iteration to search the provided name
 * 		-Object extraAguments = Future use
 * Use of the function: Function for closing the current browser
 * Author: Utkarsh Pratap Singh
 * Date: 12 FEB 2020
 */	
	public void fnGoogleNameSearching(String totelIteration,String valueToSearch ,Object extraAguments) {
	
		if(driver.findElement(GoogleSearchPageOR.searchInputField).isEnabled()){
			
			for(int startItr=1;startItr<=(int)(Double.parseDouble(totelIteration));startItr++) {	
				
				enterValueInField(GoogleSearchPageOR.searchInputField, valueToSearch, "");
				driver.findElement(GoogleSearchPageOR.searchInputField).submit();
				//driver.findElement(GoogleSearchPageOR.btnGoogleSearch).click();
				
				String pagetitle= fngetTitleOfThePage();
				System.out.println(pagetitle);
				
				//Waiting for the google result to get display
				//WebDriverWait myDynamicElement = new WebDriverWait(driver, TestUtil.WebDriverWait);
				new WebDriverWait(driver, TestUtil.WebDriverWait).until(ExpectedConditions.presenceOfElementLocated(GoogleSearchPageOR.resultSet));
				
				//if the google result page matched with the name search then go the previous page and refresh that page
				if(pagetitle.trim().contains(globalmap.get("Search Value").toString())) {
					driver.navigate().back();
					driver.navigate().refresh();
				}
				
			}//closing for loop	
	
	   }
   }

	
	
	
	
	
	
}	