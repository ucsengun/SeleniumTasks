package TechnoStudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_2_login {
    public static void main(String[] args) {
        //Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open browser and get webpage
        driver.get("https://www.facebook.com");

        //Locat the username input box and send random string
        driver.findElement(By.id("email").)
    }
}
