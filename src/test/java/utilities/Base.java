package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddObjects;
import pageObjects.SearchObjects;

public class Base {

    public static WebDriver driver;
    public SearchObjects search;
    public AddObjects add;


    public void setBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nusra\\Downloads\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void quit() {
        driver.quit();
    }
}