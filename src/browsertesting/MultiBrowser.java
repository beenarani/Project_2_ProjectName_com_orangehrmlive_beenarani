package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = "";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        //2.1 - Set up Chrome browser
        String BaseURl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2.2 - Open URL.
        driver.get(BaseURl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //2.3 - Print the title of the page.
        System.out.println("The title of the page is: " + driver.getTitle());

        //2.4 - Print the current url.
        System.out.println(driver.getCurrentUrl());

        //2.5 - Print the page source.
        System.out.println(driver.getPageSource());

        //2.6 - Click on ‘Forgot your password?’ link.
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //2.7 - Print the current url.
        System.out.println("Get current URl" + driver.getCurrentUrl());

        //2.8 - Navigate back to the login page.
        driver.navigate().back();

        //2.9 - Refresh the page.
        driver.navigate().refresh();

        //2.10 - Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("Admin");

        //2.11 - Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("admin123");

        //2.12 - Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //2.13 -  Close the browser.
        driver.quit();
    }
}


