package TechnoStudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_3 {
    public static void main(String[] args) {
        //Set up driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    }
}
