package TechnoStudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_7 {
    public static void main(String[] args) {
        //Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver def= new ChromeDriver();

        //Go to the specified URL
        def.get("https://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //Verify the title
        String expectedTitle = "Web Orders Login";
        String actualTitle = def.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Successful");
        } else {
            System.out.println("Title Verification Failed");
        }

        //Enter username
        def.findElement(By.id("ct100_MainContent_username")).sendKeys("Tester");

        //Enter password
        def.findElement(By.id("ct100_MainContent_password")).sendKeys("test");

        //Click "Sign In" button
        def.findElement(By.id("ct100_MainContent_login_button")).click();

        //Verify title
        expectedTitle = "Web Orders";
        actualTitle = def.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification Successful");
        } else {
            System.out.println("Title Verification Failed");
        }

        //Close the driver
        def.quit();
    }
}
