package stepDefinition;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

// extends -> inheritance
public class Hooks extends env {

    @Before
    public void before() {
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
//    	WebDriverManager.chromedriver().setup();
    	WebDriverManager.edgedriver().setup();
//    	driver = new ChromeDriver();
        driver = new EdgeDriver();
        
//    	if(browser.equals("Edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		} else if(browser.equals("chrome")){
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
        driver.manage().window().maximize();
        driver.get(url);
    }

    @After
    public void after() {
        driver.quit();
    }
}
