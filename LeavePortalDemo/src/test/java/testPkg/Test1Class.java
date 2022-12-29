package testPkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1Class 
{ 
public static void LaunchBrowser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC");
driver.manage().window().maximize();
}
}
