package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.LeaveListPage;

public class LeaveList extends LeaveListPage {
    static LeaveListPage leaveListPage = new LeaveListPage();

    public static void enterEmployeeName(String employeeName){
        leaveListPage.setEmployeeName(employeeName);
    }

    public static void clickSearchButton(){
        leaveListPage.clickSearch();
    }

    public static boolean isAvailableRow(){
        return leaveListPage.availabilityOfRow();
    }

    public static int getNumberOfRows(){
        return leaveListPage.getCountOfRows();
    }


}
