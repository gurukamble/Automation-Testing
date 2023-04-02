package com.hrms.lib;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global {
	
	public WebDriver driver;

	//To Provide all reusable functionality of Whole Application
	
	public void openApplication () {
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened Successfully");
		Reporter.log("Application Opened Successfully");
		Log.info("Application Opened Successfully");
	}
	
	public void closeApplication() {
		driver.close();
	System.out.println("Application Closed Successfully");
	Log.info("Application Closed Successfully");
	}
	
	public void login () throws Exception {
		driver.findElement(By.name(txt_username)).sendKeys(UserName);
		driver.findElement(By.name(txt_Password)).sendKeys(password);
		driver.findElement(By.name(btn_Login)).click();
		System.out.println("Application Login Successfully");
		Log.info("Application Login Successfully");
		Thread.sleep(3000);
	}
	
	public void logout() throws Exception {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout from Application Successfully");
		Log.info("Logout from Application Successfully");
		Thread.sleep(3000);
	}
	
	public void entering_Frame () {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into Frame");
		Log.info("Entered into Frame Successfully");
	}
	
	public void exit_from_Frame () {
		driver.switchTo().defaultContent();
		System.out.println("Exit From Frame");
		Log.info("Exit From Frame Successfully");
	}
	
	public void add_Employee() throws Exception {
		driver.findElement(By.xpath(add_btn_xpath)).click();
		driver.findElement(By.name(txt_FirstName)).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(By.name(txt_LastName)).sendKeys(lastName);
		Thread.sleep(3000);
		driver.findElement(By.id(save_btn_id)).click();
		System.out.println("Employee Added Successfully");
		Log.info("Employee Added Successfully");
		Thread.sleep(3000);
	}
	
	public void clickon_anyEmpName () throws Exception {
		driver.findElement(By.xpath(any_EmpName_xpath)).click();
		System.out.println("Clicked on any Employee Name");
		Log.info("Clicked on any Employee Name");
		Thread.sleep(3000);
	}
	public void edit_Emp() throws Exception {
		driver.findElement(By.name(edit_btn)).click();
		driver.findElement(By.name(txt_FirstName)).clear();
		Thread.sleep(3000);
		driver.findElement(By.name(txt_LastName)).clear();
		Thread.sleep(3000);
		driver.findElement(By.name(txt_FirstName)).sendKeys(firstName);
		Thread.sleep(3000);
		driver.findElement(By.name(txt_LastName)).sendKeys(lastName);
		Thread.sleep(3000);
		driver.findElement(By.id(save_btn_id_EditEmp)).click();
		Thread.sleep(3000);
		System.out.println("Employee details Edit successfully");
		Log.info("Employee details Edit Successfully");
	}
	
	public void click_delete_btn () throws Exception {
		driver.findElement(By.xpath(delete_btn_xpath)).click();
		System.out.println("Click on Delete Button");
		Log.info("Clicked on Delete Button");
		Thread.sleep(3000);
	}
	
	public void searchBy_DropDown () throws Exception {
		Select searchBy = new Select(driver.findElement(By.name(searchBY_name)));
		searchBy.selectByValue("0");
		System.out.println("Selected Search By Option");
		Log.info("Selected SearchBy option");
		Thread.sleep(3000);
	}
	
	public void Searchfor_txtbox () throws Exception {
		driver.findElement(By.name(searchFOR_txt_name)).sendKeys("7016");
		System.out.println("Entered Emp ID in Search For txtbox");
		Thread.sleep(3000);
		driver.findElement(By.xpath(search_btn_xpath)).click();
		System.out.println("Clicked on Search Button");
		Log.info("Clicked on Search Button");
		System.out.println();
	}
	
	public void select_delete_Emp_Checkbox () throws Exception {
		driver.findElement(By.name(checkbox_delete_Emp_)).click();
		System.out.println("Employee Selected Successfully");
		Log.info("Employee Selected Successfully");
		Thread.sleep(3000);
	}
	
}
