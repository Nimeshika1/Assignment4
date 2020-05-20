package com.sysco.orangehrm.util;

import com.sysco.orangehrm.data.AddEmployeeDataProvider;
import com.sysco.orangehrm.data.AddLeaveEntitlementDataProvider;
import com.sysco.orangehrm.data.DashboardDataProvider;
import com.sysco.orangehrm.data.LoginDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class TestBase {
    protected LoginDataProvider loginData = new LoginDataProvider();
    protected DashboardDataProvider dashboardDataProvider = new DashboardDataProvider();
    protected SoftAssert softAssert = new SoftAssert();
    protected AddEmployeeDataProvider addEmployeeData = new AddEmployeeDataProvider();
    protected AddLeaveEntitlementDataProvider addLeaveEntitlementDataProvider = new AddLeaveEntitlementDataProvider();

    @BeforeMethod
    public void init(){

    }



    @AfterMethod
    public void updateMethod(){

    }


}
