package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class AddLeaveEntitlementPage  extends LoginPage{
    protected By txtEmployeeName = By.id("entitlements_employee_empName");
    protected By drpDwnEmployeeName = By.xpath("//*[@class='ac_even ac_over']/strong");
    protected By txtEntitlement = By.id("entitlements_entitlement");
    protected By btnSave = By.id("btnSave");
    protected By btnConfirm = By.id("dialogUpdateEntitlementConfirmBtn");

    public void setEmployeeName(String employeeName){
        syscoLabUI.sleep(3);
        syscoLabUI.sendKeys(txtEmployeeName, employeeName);
    }

    public void selectEmployeeFromDropDown(){
        syscoLabUI.click(drpDwnEmployeeName);
    }

    public void addEntitlement(String entitlement){
        syscoLabUI.sendKeys(txtEntitlement, entitlement);
    }

    public void clickLeaveEntitlementSaveButton(){
        syscoLabUI.click(btnSave);
    }

    public void clickConfirmLeave(){
        syscoLabUI.waitTillElementLoaded(btnConfirm);
        syscoLabUI.click(btnConfirm);
        syscoLabUI.sleep(4);
    }

}
