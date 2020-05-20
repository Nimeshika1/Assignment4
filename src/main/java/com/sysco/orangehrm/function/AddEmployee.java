package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.AddEmployeePage;

public class AddEmployee extends AddEmployeePage {
    static AddEmployeePage addEmployeePage =new AddEmployeePage();

    public static void setUserDetails(String firstName, String lastName){
        addEmployeePage.setFirstName(firstName);
        addEmployeePage.setLastName(lastName);
    }

    public static void clickSaveButton(){
        addEmployeePage.clickSave();
    }

    public static void setLoginDetaila(String userName, String password){
        addEmployeePage.clickCreateLoginDetails();
        addEmployeePage.setUserName(userName);
        addEmployeePage.setPassword(password);
        addEmployeePage.setConfirmPassword(password);
    }

}
