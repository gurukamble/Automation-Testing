package TestNG;

//packages for Reading Excel File
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//packages for WebDriver
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//packages for TestNG
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Excel_TestNG_WebDriver {
	
	WebDriver driver;
	
                             //Test Cases
@BeforeClass	
	public void OpenApplication () {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened Successfully");
		System.out.println("Application Opened Successfully");
		System.out.println(driver.getTitle());
	}
	
@Test
	public void login_Logout() throws Exception {
//To get Data from Excel File	
		FileInputStream file = new FileInputStream("C:\\Selenium\\Selenium_Login Data.xlsx");
	    XSSFWorkbook wb = new  XSSFWorkbook(file);
	    XSSFSheet st = wb.getSheetAt(0);
	   String un = st.getRow(1).getCell(0).getStringCellValue();
	   String pw = st.getRow(1).getCell(1).getStringCellValue();
	   
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Reporter.log("Login Completed");
	}

@AfterClass
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed Successfully");
		Reporter.log("Application Closed Successfully");
	}
}
