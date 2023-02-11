package TechnoStudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_6 {
    public static void main(String[] args) {
        //Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver bcd= new ChromeDriver();

        //Go to https://google.com
        bcd.get("https://google.com");

        //Write "apple" in the search box
        bcd.findElement(By.name("q")).sendKeys("apple");

        //Click the Google search button or press enter
        bcd.findElement(By.name("btnK")).click();

        //Verify the title
        String expectedTitle = "apple - Google Search";
        String actualTitle = bcd.getTitle();
        if (actualTitle.startsWith("apple")){
            System.out.println("Title Verification");
        } else {
            System.out.println("Title Verification Failed");
        }

        //Close the driver
        bcd.quit();
    }
}
