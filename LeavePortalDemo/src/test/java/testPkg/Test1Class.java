package testPkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Test1Class 
{ 

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	
driver.manage().window().maximize();
	
driver.get("http://113.193.29.70:7895/LeavePortal/CreatePassword?randomPassword=$2a$10$iU4hai2Ja/GlhIoc8EyM.egfkBcysjzMq/UideYZ2YlwsRRhsUgiC");		
	
}
}


// package testcases;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.TreeSet;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.Select;
// import org.testng.Assert;
// import org.testng.annotations.AfterTest;
// import org.testng.annotations.Test;

// import io.github.bonigarcia.wdm.WebDriverManager;

// public class Check_DropDown_Options_Order {

// 	WebDriver driver;
	
// 	@Test
// 	public void dropdown_Options_Order_Test() {


// 		WebDriverManager.chromedriver().setup();//opening the chrome driver

// 		driver=new ChromeDriver();

// 		driver.get("https://www.testandquiz.com/selenium/testing.html");	

// 		//1. Get all the drop down options and store in Arraylist = originalList

// 		Select dropdown=new Select(driver.findElement(By.id("testingDropdown")));
		
// 		List<WebElement> ddlist=dropdown.getOptions();
		
// 		ArrayList<String> originalList=new ArrayList<String>();
		
// 		for(WebElement a:ddlist) {
			
// 			originalList.add(a.getText());			
// 		}
		
// 		System.out.println("================The original drop down List before sorting============== " +"\n" +originalList);
		
// 		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		
// 		//2. Copy the originalList into a new Arraylist = tempList
		
// 		ArrayList<String> tempList=new ArrayList<String>(originalList);//or You can use for loop to copy


		
		
// 		//Now sort the temp list

// 		//- Method 1 => Use sort method from Collections class

// 		Collections.sort(tempList);

// 		/*- Method 2 => Convert to Tree set
		
// 		TreeSet<String> ts=new TreeSet<String>(tempList);*/
		
// 		System.out.println("================The drop down list after sorting======================== " +"\n" +tempList);
		

		
		
		
// 		//4. Now Compare two arralist using equals 
		
// 		Assert.assertEquals(originalList, tempList,"The drop down options are not in order");

// 	}
	
	
	
// 	@AfterTest
// 	public void teardown() {
// 		driver.close();
// 	}
// }
// package testPkg;


// import org.openqa.selenium.By;  
// import org.openqa.selenium.JavascriptExecutor;  
// import org.openqa.selenium.WebDriver;  
// import org.openqa.selenium.chrome.ChromeDriver;
// import java.util.concurrent.TimeUnit;  

// public class Test1Class 
// { 
// public static void main(String[] args) {

// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
// WebDriver driver = new ChromeDriver();
// driver.get("http://192.168.137.2:7895/LeavePortal/Login/True");
// driver.manage().window().maximize();

// // wait time added
//  //Thread.sleep(200);


// }
// }
