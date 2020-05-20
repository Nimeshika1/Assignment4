package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.LoginPage;

public class Login extends LoginPage{
    static LoginPage loginPage = new LoginPage();

    public static void navigateAthletesFootHomePage(){
        loginPage.openAthletesFootHomePage();
    }

    public static void setLoginDetails(String username, String password){
        loginPage.setUName(username);
        loginPage.setPassword(password);
    }

    public static void quitTheDriver(){
        loginPage.quitDriver();
    }

    public static void clickLoginButton(){
        loginPage.clickLoginBtn();
    }

}
