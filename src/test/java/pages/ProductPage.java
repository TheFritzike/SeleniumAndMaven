package pages;

import common.CommonMethods;
import org.openqa.selenium.By;

public class ProductPage extends CommonMethods {
    public boolean verifyProductsText(String expectedText){
        String productText = driver.findElement(By.xpath("//span[contains(text(),"+ expectedText +")]")).getText();
        return productText.equals("PRODUCTS");
    }
}
