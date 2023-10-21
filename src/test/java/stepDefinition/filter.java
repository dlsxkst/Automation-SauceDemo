package stepDefinition;

import config.env;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepository.pageFilter;
import objectRepository.pageProduct;

import org.junit.Assert;
import org.junit.Assert.*;

import java.time.Duration;

public class filter extends env {
	
	pageFilter elementFilter = new pageFilter();
	
    @When("user click  filter menu")
    public void user_click_filter_menu() {
        WebElement filterMenu = driver.findElement(elementFilter.getBtnFilter());
        filterMenu.click();
    }
    
    @When("user click Name\\(Z to A)")
    public void user_click_name_z_to_a() {
    	WebElement filter = driver.findElement(elementFilter.getFilter());
    	filter.click();
    }
    
    @Then("user verify success filtering")
    public void user_verify_success_filtering() {
    	WebElement confirmFilter = driver.findElement(elementFilter.getConfirm());
//    	String actualText = confirmFilter.getText();
//        String expectedText = "Test.allTheThings() T-Shirt (Red)";
//        Assert.assertEquals(actualText, expectedText);
    }
    
    @Then("user verify failed filtering")
    public void user_verify_failed_filtering() {
    	WebElement failedFilter = driver.findElement(elementFilter.getConfirmFail());
    }
}
