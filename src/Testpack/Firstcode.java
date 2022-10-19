package Testpack;

//fetch Mercury Tours’ homepage
//        verify its title
//        print out the result of the comparison
//        close it before ending the entire program.
//------------------------------------------------------------

//Note: Starting Firefox 35, you need to use gecko driver created by Mozilla to use Web Driver.
// Selenium 3.0, gecko and firefox has compatibility issues and setting them correctly could become an uphill task.
// If the code does not work, downgrade to Firefox version 47 or below. Alternatively, you can run your scripts on Chrome.
// Selenium works out of the box for Chrome.
// You just need to change 3 lines of code to make your script work with Chrome or Firefox
//-------------------------------------------------------------------------

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstcode {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver d1 = new FirefoxDriver();
        //----------------------------------------------------------
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
       // --------------------------------------------------------

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        d1.get(baseUrl);

        // get the actual value of the title
        actualTitle = d1.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        d1.close();

    }
}
