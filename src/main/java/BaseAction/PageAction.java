package BaseAction;

import org.openqa.selenium.WebElement;

import Binding.Base;

public class PageAction extends Base{
	
	//click
	public static void ClickOnElement(WebElement ele) {
		ele.click();
	}
	
	public static void EnterText(WebElement ele, String text) {
		ele.sendKeys(text);
	}

}
