package TechnoStudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_5 {
    public static void main(String[] args) {
        //Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver abcd= new ChromeDriver();

        //Go to https://google.com
        abcd.get("https://google.com");

        //Click on Gmail from top right
        abcd.findElement(By.xpath("//a[@class='gb_P' and text()='Gmail']")).click();

        //Verify the title contains "Gmail"
        String expectedTitle = "Gmail";
        String actualTitle = abcd.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Successful");
        } else {
            System.out.println("Title Verification Failed");
        }

        //Go back to Google
        abcd.navigate().back();

        //Verify the title equals "Google"
        expectedTitle = "Google";
        actualTitle = abcd.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Successful");
        } else {
            System.out.println("Title Verification Failed");
        }

        //Close the driver
        abcd.quit();
    }
}
