package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.DashboardPage;

public class Dashboard extends DashboardPage {
    static DashboardPage dashboardPage = new DashboardPage();

    public static String getWelcomeMessage(){
        return dashboardPage.getwelcomeMessage();
    }
}
