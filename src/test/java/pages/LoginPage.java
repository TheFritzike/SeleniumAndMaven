package pages;

import common.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends CommonMethods {
    public boolean userInputSearch() {
        WebElement userInput = driver.findElement(By.id("user-name"));
        userInput.clear();
        userInput.sendKeys("standard_user");
        return true;
    }
    public boolean passwordInputSearch(){
        WebElement passInput = driver.findElement(By.id("password"));
        passInput.clear();
        passInput.sendKeys("secret_sauce");
        return true;
    }
    public boolean loginPress(){
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        return true;
    }
}
