package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class LeaveEntitlementsPage extends LoginPage {

    protected By lblEntitlementType = By.xpath("//*[@id='resultTable']//*[@class='left'][1]");
    protected By chkSelectAllLeaveEntitlement = By.id("ohrmList_chkSelectAll");
    protected By btnDelete = By.id("btnDelete");
    protected By btnConfirmDelete = By.id("dialogDeleteBtn");

    public String getEntitlementType(){
        syscoLabUI.sleep(4);
        return syscoLabUI.getText(lblEntitlementType);
    }

    public void selectAddedLeaveEntitlement(){
        syscoLabUI.sleep(3);
        syscoLabUI.click(chkSelectAllLeaveEntitlement);
    }

    public void clickDeleteButton(){
        syscoLabUI.click(btnDelete);
    }

    public void clickConfirmDelete(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(btnConfirmDelete);
    }
}
