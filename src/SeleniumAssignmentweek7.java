import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignmentweek7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hello Selenium...");
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		driver.close();
 

	}

}
