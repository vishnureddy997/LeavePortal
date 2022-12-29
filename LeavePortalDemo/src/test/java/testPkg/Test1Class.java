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
public void startBrowser(String browserName)
	{
		System.out.println("Parameter value is "+browserName);
		WebDriver driver=null;
		
		if(browserName.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--headless");
			opt.addArguments("--no-sandbox");
			opt.addArguments("--disable-dev-shm-usage");
			driver=new ChromeDriver(opt);
		}
		else if(browserName.contains("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
//public static void main(String[] args)

	public void LaunchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
driver.manage().window().maximize();
driver.get("http://192.168.137.2:7895/LeavePortal/Login/True");
driver.quit();
}
}
