package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.AddLeaveEntitlementPage;

public class AddLeaveEntitlement extends AddLeaveEntitlementPage {
    static AddLeaveEntitlementPage addLeaveEntitlementPage = new AddLeaveEntitlementPage();

    public static void setEmployeeNameINLeaveEntitlement(String employeeName){
        addLeaveEntitlementPage.setEmployeeName(employeeName);
        addLeaveEntitlementPage.selectEmployeeFromDropDown();
    }

    public static void setLeaveEntitlement(String entitlement){
        addLeaveEntitlementPage.addEntitlement(entitlement);
        syscoLabUI.sleep(1);
    }

    public static void saveAddedLeaveEntitlement(){
        addLeaveEntitlementPage.clickLeaveEntitlementSaveButton();
    }

    public static void confirmLeaveEntitlement(){
        addLeaveEntitlementPage.clickConfirmLeave();
    }

}
