package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class HeaderPage extends LoginPage{
    protected By btnWelcomeAdmin = By.id("welcome");
    protected By btnLogout = By.xpath("//a[@href='/index.php/auth/logout']");

    public void clickOnWelcome(){
        syscoLabUI.sleep(5);
        syscoLabUI.click(btnWelcomeAdmin);
    }

    public void clickLogout(){
        syscoLabUI.click(btnLogout);
        syscoLabUI.sleep(2);
    }


}
