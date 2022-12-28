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
WebDriver driver;
@Test

//public static void main(String[] args)

	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();//opening the chrome driver

		driver=new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://192.168.137.2:7895/LeavePortal/Login/True");
driver.manage().window().maximize();
}
}
