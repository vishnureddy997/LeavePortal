package testPkg;


// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

from selenium import webdriver;
import chromedriver_autoinstaller;



//public class Test1Class 
	
	
//{ 
//	@Test
//	
//	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://attom:d91f0fc6@rtweb-qa.azurewebsites.net/");
//	}
//}

public class Test1Class 

{ 

 public WebDriver driver; 

 public String baseUrl = "http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC";  
@Test
	 public void test1() { 
	//public static void main(String[] args) {
	
	
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 chromedriver_autoinstaller.install();

//Chrome options
// chrome_options = webdriver.ChromeOptions()
// chrome_options.add_argument('--no-sandbox')
// chrome_options.add_argument("--disable-infobars")
// chrome_options.add_argument('--disable-dev-shm-usage')

//Run chrome
driver = webdriver.Chrome(options=chrome_options);
	
	
	WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();

 ChromeOptions options = new ChromeOptions();

 options.addArguments("--no-sandbox");

 options.addArguments("--disable-dev-shm-usage");

 options.addArguments("--headless");

 driver = new ChromeDriver(options);

System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

  //driver.get("http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC");

 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  

 driver.manage().window().maximize();  

 driver.get(baseUrl);

 driver.close();


// public static void main(String[] args) {
	
	
// 	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
       
//         //create object of chrome options
//         ChromeOptions options = new ChromeOptions();
        
//         //add the headless argument
//         options.addArguments("headless");
        
//         //pass the options parameter in the Chrome driver declaration
//         WebDriver driver = new ChromeDriver(options);
        
//         //Navigate to toolsQA site url
//         driver.get("http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC");
        
//         //Print the Title of the Page
//         //System.out.println("Title of the page is -> " + driver.getTitle());
        
//         //Close the driver
//         driver.close();
    }
}

	//public void LaunchBrowser() {
//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC");
//driver.manage().window().maximize();
//}
//}
