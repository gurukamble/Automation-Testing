package com.hrms.AScripts;

import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC002_AddEmp {
 
	//public static void main (String args[]) throws Exception {
@Test		
	public void addEmp() throws Exception {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.entering_Frame();
		obj.add_Employee();
		obj.exit_from_Frame();
		obj.logout();
		obj.closeApplication();
	}
}
