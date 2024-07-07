import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity11 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
        // Driver object reference
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        
        System.out.println("Home page title: " + driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.name("toggled"));
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        // Click the checkbox to deselect it
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
		
	}

}
