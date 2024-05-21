import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_5_Chrome_Browser {
    /**
     * Project-5 - ProjectName : com-utimateqa
     * BaseUrl = https://courses.ultimateqa.com/
     * 1. Setup Chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Click on ‘Sign In’ link
     * 7. Print the current url
     * 8. Enter the email to email field.
     * 9. Enter the password to password field.
     * 10. Click on Login Button.
     * 11. Navigate to baseUrl.
     * 12. Navigate forward to Homepage.
     * 13. Navigate back to baseUrl.
     * 14. Refresh the page.
     * 15. Close the browser.
     */
    public static void main(String[] args) {
        //Setup Chrome browser
        String baseUrl = "https://courses.ultimateqa.com/";
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Title of the Page: " + driver.getTitle());
        //Print the current url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source: " + driver.getPageSource());
        //Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sign In")).click();
        //Print the current url
        System.out.println("Current Url" + driver.getCurrentUrl());
        //Enter the email to email field
        driver.findElement(By.name("user[email]")).sendKeys("Prime123@gmail.com");
        //Enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("prime123");
        //Click on Login Button
        driver.findElement(By.className("g-recaptcha")).click();
        //Navigate to baseUrl
        driver.navigate().back();
        //Navigate forward to Homepage
        driver.navigate().forward();
        //Navigate back to baseUrl
        driver.navigate().back();
        //Refresh the page
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        //Close the browser
        driver.quit();
    }
}
