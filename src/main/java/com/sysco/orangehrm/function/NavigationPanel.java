package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.NavigationPanelPage;

public class NavigationPanel extends NavigationPanelPage {
    static NavigationPanelPage navigationPanelPage = new NavigationPanelPage();

    public static void clickOnPIMenu(){
        navigationPanelPage.clickPIM();
    }

    public static void clickOnAddEmployeeOption(){
        navigationPanelPage.clickAddEmployee();
    }

    public static void clickOnEMployeeListOPtion(){
        navigationPanelPage.clickEmployeeList();
    }

    public static void navigateToAddLeaveEntitlement(){
        navigationPanelPage.clickLeave();
        navigationPanelPage.clickEntitlements();
        navigationPanelPage.clickAddEntitlements();
    }

    public static void applyLeave(){
        navigationPanelPage.clickLeave();
        syscoLabUI.sleep(2);
        navigationPanelPage.clickAppyLeave();

    }
    public static void navigateToLeaveList(){
        syscoLabUI.sleep(2);
        navigationPanelPage.clickLeave();
        syscoLabUI.sleep(2);
        navigationPanelPage.clickLeaveList();
    }

}
