package com.sysco.orangehrm.page;

import com.sysco.orangehrm.common.Constant;
import com.sysco.orangehrm.util.DriverEnvironmentSetUpUtil;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;

public class LoginPage{
    protected static SyscoLabUI syscoLabUI;
    protected By txtUserName = By.id("txtUsername");
    protected By txtPassword = By.id("txtPassword");
    protected By btnLogin = By.id("btnLogin");

    public void openAthletesFootHomePage(){
        DriverEnvironmentSetUpUtil.setToRunLocally();
        syscoLabUI = new SyscoLabWUI(null);
        syscoLabUI.driver.manage().window().maximize();
        syscoLabUI.navigateTo(Constant.APP_URL);

    }

    public void setUName(String username){
        syscoLabUI.sendKeys(txtUserName,username);
    }

    public void setPassword(String password){
        syscoLabUI.sendKeys(txtPassword, password);
    }

    public void clickLoginBtn(){
        syscoLabUI.click(btnLogin);
    }

    public void quitDriver(){
        syscoLabUI.quit();
    }



}
