package objectRepository;

import org.openqa.selenium.By;

public class pageFilter {
	By btnFilter = By.className("product_sort_container");
	By filter = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
	
	By confirm = By.xpath("//*[@id=\"item_3_title_link\"]/div");
	By confirmFail = By.xpath("//*[@id=\"item_4_title_link\"]");
	
	public By getBtnFilter(){
        return btnFilter;
    }
	
	public By getFilter(){
        return filter;
    }
	
	public By getConfirm() {
		return confirm;
	}
	
	public By getConfirmFail() {
		return confirmFail;
	}
	
}
