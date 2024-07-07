import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity15 {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		// Driver object reference
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the browser
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

		System.out.println("Home page title: " + driver.getTitle());
		
		  // Find the username and password fields
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
        // Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        // Find and click the submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Print the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
	}

}
