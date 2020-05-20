package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class AddEmployeePage extends LoginPage{
    protected By txtFirstName = By.id("firstName");
    protected By txtLastName = By.id("lastName");
    protected By btnSave = By.id("btnSave");
    protected By chkCreateLoginDetails = By.id("chkLogin");
    protected By txtUserName = By.id("user_name");
    protected By txtPassword = By.id("user_password");
    protected By txtConfirmPassword = By.id("re_password");

    public void setFirstName(String firstName){
        syscoLabUI.sleep(4);
        syscoLabUI.sendKeys(txtFirstName,firstName);
    }

    public void setLastName(String lastName){
        syscoLabUI.sendKeys(txtLastName,lastName);
    }

    public void clickSave(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(btnSave);
    }

    public void clickCreateLoginDetails(){
        syscoLabUI.waitTillElementLoaded(chkCreateLoginDetails);
        syscoLabUI.click(chkCreateLoginDetails);
    }

    public void setUserName(String userName){
        syscoLabUI.sendKeys(txtUserName, userName);
    }

    public void setPassword(String password){
        syscoLabUI.sendKeys(txtPassword, password);
    }

    public void setConfirmPassword(String confirmPassword){
        syscoLabUI.sendKeys(txtConfirmPassword, confirmPassword);
    }

}
