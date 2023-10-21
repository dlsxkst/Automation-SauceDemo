package test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class login {
    @Test
    public void main() {

//        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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
    }
}