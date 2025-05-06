package att;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class week3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", 
                "/home/renaissance0ne/Downloads/chromedriver-linux64/chromedriver");
        
        //Use the below code if you want to use brave
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/brave-browser");
        WebDriver driver = new ChromeDriver(options);
        
        //Add the below if you are using Chrome
        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create new account")).click(); 
        Thread.sleep(2000);  

        driver.findElement(By.name("firstname")).sendKeys("renai");
        driver.findElement(By.name("lastname")).sendKeys("ssance");
        driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        driver.findElement(By.name("reg_passwd__")).sendKeys("renai");

        new Select(driver.findElement(By.name("birthday_day"))).selectByValue("12");
        new Select(driver.findElement(By.name("birthday_month"))).selectByValue("12");
        new Select(driver.findElement(By.name("birthday_year"))).selectByValue("2000");

        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        driver.findElement(By.name("websubmit")).click();
    }
}
