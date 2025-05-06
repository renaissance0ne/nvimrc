package att;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class week5 {

	public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", 
                "/home/renaissance0ne/Downloads/chromedriver-linux64/chromedriver");
        
        //Use the below code if you want to use brave
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/brave-browser");
        WebDriver driver = new ChromeDriver(options);
        
        //Add the below if you are using Chrome
        //WebDriver driver = new ChromeDriver();
        driver.get("https://cmritautonomous.org/beeserp/Login.aspx");
        driver.findElement(By.name("txtUserName")).sendKeys("20R01A05K6P");
        driver.findElement(By.name("btnNext")).click();
        driver.findElement(By.name("txtPassword")).sendKeys("20R01A05K6P");
        driver.findElement(By.name("btnSubmit")).click();
	}

}
