package Again;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gitbasic {
	
	@Test
	public void loginPage() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  d = new ChromeDriver();
		d.get("https://git-scm.com/download/win");
	

}
}
