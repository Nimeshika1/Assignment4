package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class DashboardPage  extends LoginPage{
    protected By lblWelcomeMessage = By.id("welcome");

    public String getwelcomeMessage(){
        syscoLabUI.waitTillElementLoaded(lblWelcomeMessage);
        return syscoLabUI.getText(lblWelcomeMessage);
    }
}
