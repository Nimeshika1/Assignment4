package com.sysco.orangehrm.tests;

import com.sysco.orangehrm.function.Dashboard;
import com.sysco.orangehrm.function.Login;
import com.sysco.orangehrm.util.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void testLoginPage(){
        Login.navigateAthletesFootHomePage();
        Login.setLoginDetails(loginData.validUserName, loginData.validPassword);
        Login.clickLoginButton();
        softAssert.assertEquals(Dashboard.getWelcomeMessage(), dashboardDataProvider.welcomeMessage,"Verify success of login");
        softAssert.assertAll();
    }
}
