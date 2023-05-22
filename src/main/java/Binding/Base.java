package Binding;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class Base {
	public static String URL = "https://www.nykaa.com";
	public static WebDriver driver;
	public static Actions act;
	
	@io.cucumber.java.Before
	public static void Start() {
	
		// launch the application

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get(URL);

		
	}
	@io.cucumber.java.After
	public void End() {
		
	}
}
