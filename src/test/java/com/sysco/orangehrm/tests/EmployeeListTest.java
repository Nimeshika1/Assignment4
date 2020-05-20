package com.sysco.orangehrm.tests;

import com.sysco.orangehrm.function.AddEmployee;
import com.sysco.orangehrm.function.EmployeeList;
import com.sysco.orangehrm.function.Login;
import com.sysco.orangehrm.function.NavigationPanel;
import com.sysco.orangehrm.util.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeListTest extends TestBase {

    @BeforeClass
    public void init(){
        Login.navigateAthletesFootHomePage();
        Login.setLoginDetails(loginData.validUserName, loginData.validPassword);
        Login.clickLoginButton();
        NavigationPanel.clickOnPIMenu();
        NavigationPanel.clickOnAddEmployeeOption();
        AddEmployee.setUserDetails(addEmployeeData.firstName, addEmployeeData.lastName);
        AddEmployee.clickSaveButton();
    }

    @Test
    public void testEmployeeListPage(){
        NavigationPanel.clickOnEMployeeListOPtion();
        EmployeeList.searchEmployeeName(addEmployeeData.firstName);
        softAssert.assertTrue(EmployeeList.isAvailableEnteredEmployee(),"Verify added employee available in employee list");
        softAssert.assertAll();
    }

    @AfterClass
    public void quitTesting(){
        EmployeeList.deleteSelectedEmployee();
        Login.quitTheDriver();
    }
}
