package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.HeaderPage;

public class Header extends HeaderPage {
    static HeaderPage headerPage = new HeaderPage();

    public static void clickOnLogout(){
        headerPage.clickOnWelcome();
        syscoLabUI.sleep(2);
        headerPage.clickLogout();
    }

}
