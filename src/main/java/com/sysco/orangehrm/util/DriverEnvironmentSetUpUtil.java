package com.sysco.orangehrm.util;

import java.util.logging.Logger;

public class DriverEnvironmentSetUpUtil {
    public DriverEnvironmentSetUpUtil(){}
    public static String chromeDriver = "webdriver.chrome.driver";
    public static void setToRunLocally(){
        System.setProperty(chromeDriver,"src/main/resources/chromedriver/"+System.getProperty("os.arch")+"/chromedriver");
        Logger.getLogger(System.getProperty(chromeDriver));
    }
}
