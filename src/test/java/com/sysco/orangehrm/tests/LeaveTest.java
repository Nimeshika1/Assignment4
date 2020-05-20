package com.sysco.orangehrm.tests;

import com.sysco.orangehrm.function.*;
import com.sysco.orangehrm.util.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LeaveTest extends TestBase {

    @BeforeClass
    public void init(){
        Login.navigateAthletesFootHomePage();
        Login.setLoginDetails(loginData.validUserName, loginData.validPassword);
        Login.clickLoginButton();
        NavigationPanel.clickOnPIMenu();
        NavigationPanel.clickOnAddEmployeeOption();
        AddEmployee.setUserDetails(addEmployeeData.firstName, addEmployeeData.lastName);
        AddEmployee.setLoginDetaila(addEmployeeData.username, addEmployeeData.password);
        AddEmployee.clickSaveButton();
        NavigationPanel.navigateToAddLeaveEntitlement();
    }

    @Test
    public void testLeaveCanAddedToUser(){
        AddLeaveEntitlement.setEmployeeNameINLeaveEntitlement(addLeaveEntitlementDataProvider.employeeName);
        AddLeaveEntitlement.setLeaveEntitlement(addLeaveEntitlementDataProvider.entitlement);
        AddLeaveEntitlement.saveAddedLeaveEntitlement();
        AddLeaveEntitlement.confirmLeaveEntitlement();
        softAssert.assertEquals(LeaveEntitlements.getLeaveEntitlementAdded(),"Added","Verify leave entitlement added");
        softAssert.assertAll();
    }

    @Test(dependsOnMethods = "testLeaveCanAddedToUser")
    public void TestAdminCanSeeLeaveAddedByEmployee(){
        Header.clickOnLogout();
        Login.setLoginDetails(addEmployeeData.username, addEmployeeData.password);
        Login.clickLoginButton();
        NavigationPanel.applyLeave();
        ApplyLeave.applyLeave();
        ApplyLeave.clickApplyButton();
        Header.clickOnLogout();
        Login.setLoginDetails(loginData.validUserName, loginData.validPassword);
        Login.clickLoginButton();
        NavigationPanel.navigateToLeaveList();
        LeaveList.enterEmployeeName(addLeaveEntitlementDataProvider.employeeName);
        LeaveList.clickSearchButton();
        softAssert.assertTrue(LeaveList.isAvailableRow(),"Verify Admin can view leave added by employee");
        softAssert.assertEquals(LeaveList.getNumberOfRows(),1,"verify number of rows");
        softAssert.assertAll();
        NavigationPanel.clickOnPIMenu();
        NavigationPanel.clickOnEMployeeListOPtion();
        EmployeeList.searchEmployeeName(addEmployeeData.firstName);
        EmployeeList.deleteSelectedEmployee();
    }

    @AfterClass
    public void quitTesting(){
        Login.quitTheDriver();
    }
}
