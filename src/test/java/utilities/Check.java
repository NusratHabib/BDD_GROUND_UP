package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nusra\\Downloads\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@title='Printed Summer Dress']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("color_14")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}