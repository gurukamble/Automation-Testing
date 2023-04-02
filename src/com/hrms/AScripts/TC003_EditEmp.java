package com.hrms.AScripts;

import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC003_EditEmp {
	
 //public static void main(String args[]) throws Exception {
	
@Test	
   public void editEmp() throws Exception {
	 General obj = new General() ;
	 obj.openApplication();
	 obj.login();
	 obj.entering_Frame();
     obj.clickon_anyEmpName();
     obj.edit_Emp();
     obj.exit_from_Frame();
     obj.logout();
     obj.closeApplication();
 }
}
