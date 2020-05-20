package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.ApplyLeavePage;

public class ApplyLeave extends ApplyLeavePage {
    static ApplyLeavePage applyLeavePage = new ApplyLeavePage();

    public static void applyLeave(){
        applyLeavePage.selectLeaveType();
        syscoLabUI.sleep(3);
        applyLeavePage.getLeaveBalance();
        String leaveBalance = applyLeavePage.getLeaveBalance();
        applyLeavePage.selectStartDate(leaveBalance);
        syscoLabUI.sleep(2);
    }

    public static void clickApplyButton(){
        applyLeavePage.clickApplyBtn();
    }




}
