package objectRepository;

import org.openqa.selenium.By;

public class pageLogout {

    By btnlogin = By.id("login-button");
    By cekshowelement = By.xpath("//span[@class='title'][contains(text(),'Products')]");
    By btnMenu = By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div");
    By btnLogout = By.xpath("//*[@id=\"logout_sidebar_link\"]");

    public By getBtnlogin() {
        return btnlogin;
    }

    public By getCekshowelement() {
        return cekshowelement;
    }
    
    public By getBtnMenu() {
    	return btnMenu;
    }
    
    public By getBtnLogout() {
    	return btnLogout;
    }
}
