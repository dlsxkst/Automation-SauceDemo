package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
public class successBuy {
//	public static String browser = "chrome";
//	
//	public static WebDriver driver;
    @Test
    public void main() {

//        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
//    	System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
//    	if(browser.equals("Edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		} else if(browser.equals("chrome")){
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
        // --------------------------------------------------------------------------
        driver.get("https://saucedemo.com");
        // --------------------------------------------------------------------------
        WebElement email = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        email.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        System.out.println("Signed in with Standar User Successfully ");
        // --------------------------------------------------------------------------
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        // --------------------------------------------------------------------------
        WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addtocart.click();
        WebElement shoppingcart = driver.findElement(By.id("shopping_cart_container"));
        shoppingcart.click();
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement firstname = driver.findElement(By.id("first-name"));
        WebElement lastname = driver.findElement(By.id("last-name"));
        WebElement postalcode = driver.findElement(By.id("postal-code"));

        firstname.sendKeys("Intan");
        lastname.sendKeys("Supini");
        postalcode.sendKeys("10420");

        WebElement btncontinue = driver.findElement(By.id("continue"));
        btncontinue.click();

        WebElement btnfinish = driver.findElement(By.id("finish"));
        btnfinish.click();
    }
}
