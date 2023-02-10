package seleniumTasks;



public class task_1_facebookTitleVerification {
    public static void main(String[] args) {

        //Set up driver
        WebDriverManager
        WebDriver driver = new ChromeDriver();

        //Open browser and get webpage
        driver.get("https://www.facebook.com");

        //Use .getTitle() method and store the actual title in a String
        String actualTitle = driver.getTitle();

        //Create expectedTitle String
        String expectedTitle = "Facebook - Log In or Sign Up";

        //Create if conditions to do your verification
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Actual title: " + actualTitle);
            System.out.println("Expected title: " + expectedTitle);
        }

        //Close the browser
        driver.quit();

    }

}
