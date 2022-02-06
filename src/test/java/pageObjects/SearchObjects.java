package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class SearchObjects extends Base {

    public SearchObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "// input[@name='q']")
    WebElement search;

    public void sendProducts(String p) {
        search.sendKeys(p);
    }
}