package stepDefinition;

import config.env;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import objectRepository.pageLogout;

public class logout extends env {
	
	pageLogout elementLogout = new pageLogout();

    @When("user click the menu button")
    public void user_click_the_menu_button() {
    	WebElement menu_button = driver.findElement(elementLogout.getBtnMenu());
    	menu_button.click();
    }
    
    @When("user click logout")
    public void user_click_logout() {
    	WebElement logout = driver.findElement(elementLogout.getBtnLogout());
    	logout.click();
    }
    
    @Then("user verify logout successfully")
    public void user_verify_logout_successfully() {
    	WebElement verify = driver.findElement(elementLogout.getBtnlogin());
    }
}
