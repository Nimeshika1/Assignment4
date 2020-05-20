package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.LeaveEntitlementsPage;

public class LeaveEntitlements extends LeaveEntitlementsPage {
    static LeaveEntitlementsPage leaveEntitlementsPage = new LeaveEntitlementsPage();

    public static String getLeaveEntitlementAdded() {
        return leaveEntitlementsPage.getEntitlementType();
    }

    public static void removeAddedLeaveEntitlements(){
        leaveEntitlementsPage.selectAddedLeaveEntitlement();
        leaveEntitlementsPage.clickDeleteButton();
        leaveEntitlementsPage.clickConfirmDelete();
    }

}
