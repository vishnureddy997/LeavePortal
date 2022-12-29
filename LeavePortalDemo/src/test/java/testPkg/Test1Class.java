package testPkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1Class 
{ 
//	@Test
//	
//	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://attom:d91f0fc6@rtweb-qa.azurewebsites.net/");
//	}
//}

@Test

//public static void main(String[] args)

	public void LaunchBrowser() {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
options.addArgument("headless");
ChromeDriver driver = new ChromeDriver(options);
WebDriver driver = new ChromeDriver();
driver.get("http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC");
driver.manage().window().maximize();
}
}
