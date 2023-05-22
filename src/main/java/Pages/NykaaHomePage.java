package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseAction.PageAction;
import Binding.Base;

public class NykaaHomePage extends Base{
	
//	public

	//locator
	public static WebElement SearchArea=driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
	public static void ClickAndEnterTextInSearchArea(WebElement ele, String dataForSearch) {
	
		PageAction.ClickOnElement(SearchArea);
		PageAction.EnterText(SearchArea,dataForSearch);
	}
}
