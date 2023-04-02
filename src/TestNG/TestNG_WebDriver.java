package TestNG;

//WebDriver Packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//TestNG Packages
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNG_WebDriver {
	
WebDriver driver;

@BeforeClass
	public void launching_Browser () {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
driver = new EdgeDriver();
		System.out.println("Browser Open Successfully");
		Reporter.log("Browser open Successfully");
	}
	
@AfterClass
	public void close_Application () {
		driver.close();
		System.out.println("Application Closed Successfully");
		Reporter.log("Application Closed Successfully");
	}
	
@Test
	public void tc001 () throws Exception {
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened Successfully");
		Reporter.log("Application Opened Successfully");
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
		Thread.sleep(3000);
	}
}
