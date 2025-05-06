package att;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class week4 {

    public static void main(String[] args) throws InterruptedException {
        // Disable browser notifications
        HashMap<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);

        System.setProperty("webdriver.chrome.driver", 
                "/home/renaissance0ne/Downloads/chromedriver-linux64/chromedriver");

        // Set options for Brave browser
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.setBinary("/usr/bin/brave-browser");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.pnbindia.in/");
        driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div")).click();
      
        
        
    }
}
