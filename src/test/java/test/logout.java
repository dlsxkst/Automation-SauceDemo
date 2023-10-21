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

public class logout {

    @Test
    public void main() {

//        System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
//    	WebDriverManager.chromedriver().setup();
    	WebDriverManager.edgedriver().setup();
//        WebDriver driver = new ChromeDriver();
    	WebDriver driver = new EdgeDriver();
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
        WebElement burgerbtn = driver.findElement(By.id("react-burger-menu-btn"));
        burgerbtn.click();
        // --------------------------------------------------------------------------
        new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
        logout.click();
        System.out.println("Successfully Logout");
    }
}
