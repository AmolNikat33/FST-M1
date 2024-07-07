import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println("Home page titile ::::  >>>" +driver.getTitle());
		driver.manage().window().maximize();
			
		
		driver.findElement(By.name("Username")).sendKeys("admin");
		driver.findElement(By.name("Password")).sendKeys("password");
		WebElement el =driver.findElement(By.xpath("//button[text()='Log in']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", el);;
		el.click();
	}

}
