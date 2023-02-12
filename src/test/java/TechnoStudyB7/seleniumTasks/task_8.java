package TechnoStudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_8 {
    public static void main(String[] args) {
        //Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver ghj= new ChromeDriver();

        //Open the browser
        ghj.get("http://zero.webappsecurity.com/login.html");

        //Get the webpage
        ghj.get("http://zero.webappsecurity.com/login.html");

        //Locate header and get the text
        String headerText = ghj.findElement(By.tagName("h3"));

        //Create expectedTitle String
        String expectedTitle = "Log in to ZeroBank";

        //Create if conditions to do verification
        if (headerText.equals(expectedTitle)){
            System.out.println("Verification Successful");
        } else {
            System.out.println("Verification Failed");
        }

        //Close the driver
        ghj.quit();
    }
}
