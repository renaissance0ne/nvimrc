package att;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

public class week7 {

	public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", 
                "/home/renaissance0ne/Downloads/chromedriver-linux64/chromedriver");
        
        //Use the below code if you want to use brave
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/brave-browser");
        WebDriver driver = new ChromeDriver(options);
        
        //Add the below if you are using Chrome
        //WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("cmrit", Keys.ENTER);

	}

}
