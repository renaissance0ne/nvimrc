package att;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class week2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
                "/home/renaissance0ne/Downloads/chromedriver-linux64/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/brave-browser");
        
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.mercurytravels.co.in/");
        Thread.sleep(2000);
        
        Actions builder = new Actions(driver);
        WebElement customerLogin = driver.findElement(By.xpath("(//a[normalize-space()='Customer Login'])[2]"));
        builder.moveToElement(customerLogin).perform();
        Thread.sleep(2000);
        
        WebElement register = driver.findElement(By.xpath("(//a[normalize-space()='Register'])[2]"));
        register.click();
        Thread.sleep(2000);
        
        WebElement firstName = driver.findElement(By.id("acc_first_name"));
        firstName.sendKeys("DeekshithChary");
        Thread.sleep(2000);
        
        WebElement lastName = driver.findElement(By.id("acc_last_name"));
        lastName.sendKeys("P");
        Thread.sleep(2000);
        
        WebElement emailId = driver.findElement(By.id("acc_user_email"));
        emailId.sendKeys("Deekshithchary0607@gmail.com");
        Thread.sleep(2000);
        
        WebElement setPassword = driver.findElement(By.id("acc_user_password"));
        setPassword.sendKeys("12345");
        Thread.sleep(2000);
        
        WebElement confirmPassword = driver.findElement(By.id("acc_user_passconf"));
        confirmPassword.sendKeys("12345");
        Thread.sleep(2000);
        
        WebElement mobileNumber = driver.findElement(By.id("acc_mobile_no"));
        mobileNumber.sendKeys("8124563783");
        Thread.sleep(2000);
        
        WebElement registerBtn = driver.findElement(By.xpath("(//button[normalize-space()='Register'])"));
        registerBtn.click();
        Thread.sleep(1000);
        
        driver.quit();
    }
}