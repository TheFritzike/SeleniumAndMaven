package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseSetup {
    public String url = "https://www.saucedemo.com/";
    public static WebDriver driver;
    @BeforeTest
    public void browserSetup(){
        browser("Chrome");
        driver.get(url);
    }
    @AfterTest
    public void browserTearDown(){
        driver.quit();
    }

    public void browser(String selectedBrowser){
        if(selectedBrowser.equals("Chrome")){
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);
        }
    }
}
