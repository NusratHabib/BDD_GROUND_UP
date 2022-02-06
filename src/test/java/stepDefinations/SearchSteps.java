package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.SearchObjects;
import utilities.Base;

public class SearchSteps extends Base {

    @Given("User launch the Chrome browser")
    public void user_launch_the_chrome_browser() {
        setBrowser();
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    @When("User searches {string}")
    public void user_searches(String products) throws InterruptedException {
        search = new SearchObjects(driver);
        search.sendProducts(products );
        Thread.sleep(1000);
    }

    @Then("Close browser")
    public void close_browser() {
        quit();
    }
}