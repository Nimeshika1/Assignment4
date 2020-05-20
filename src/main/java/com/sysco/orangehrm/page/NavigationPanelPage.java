package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class NavigationPanelPage extends LoginPage {
    protected By nvgPIM = By.id("menu_pim_viewPimModule");
    protected By nvgAddEmployee = By.id("menu_pim_addEmployee");
    protected By nvgEmployeeList = By.id("menu_pim_viewEmployeeList");
    protected By nvgLeave = By.id("menu_leave_viewLeaveModule");
    protected By nvgEntitlements = By.id("menu_leave_Entitlements");
    protected By nvgAddEntitlement = By.id("menu_leave_addLeaveEntitlement");
    protected By btnApply = By.id("menu_leave_applyLeave");
    protected By btnLeaveList = By.id("menu_leave_viewLeaveList");

    public void clickPIM(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(nvgPIM);
    }

    public void clickLeave(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(nvgLeave);
    }

    public void clickAddEmployee(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(nvgAddEmployee);
    }

    public void clickEmployeeList(){
        syscoLabUI.click(nvgEmployeeList);
        syscoLabUI.sleep(3);
    }

    public void clickEntitlements(){
        syscoLabUI.click(nvgEntitlements);
    }

    public void clickAddEntitlements(){
        syscoLabUI.click(nvgAddEntitlement);
    }

    public void clickAppyLeave(){
        syscoLabUI.click(btnApply);
    }

    public void clickLeaveList(){
        syscoLabUI.click(btnLeaveList);
    }

}
