package com.hrms.AScripts;

import com.hrms.lib.General;
import org.testng.annotations.Test;

public class TC004_DeleteEmp {

	//public static void main (String args[]) throws Exception {
@Test
     public void deleteEmp() throws Exception {
		 General obj = new General();
		 obj.openApplication();
		 obj.login();
		 obj.entering_Frame();
		 obj.searchBy_DropDown();
		 obj.Searchfor_txtbox();
		 obj.select_delete_Emp_Checkbox();
		 obj.click_delete_btn();
		 obj.exit_from_Frame();
		 obj.logout();
		 obj.closeApplication();
	}
}
