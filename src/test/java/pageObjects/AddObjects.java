package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class AddObjects extends Base {

    public AddObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search_query_top")
    WebElement searchField;

    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement searchButton;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@title='Printed Summer Dress']")
    WebElement click;
}
