package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

public class EmployeeListPage extends LoginPage{
    protected By txtEmployeeName = By.id("empsearch_employee_name_empName");
    protected By drpDwnEmployeeName = By.xpath("//*[@class='ac_results']/ul/li/strong");
    protected By btnSearch = By.id("searchBtn");
    protected By firstRow = By.xpath("//*[@class='odd']");
    protected By chkSelectAll = By.id("ohrmList_chkSelectAll");
    protected By btnDelete = By.id("btnDelete");
    protected By btnConfirmDelete = By.id("dialogDeleteBtn");

    public void searchEmployeee(String employeeName){
        syscoLabUI.sendKeys(txtEmployeeName, employeeName);
        syscoLabUI.sleep(1);
    }

    public void selectEmployeeName(){
        syscoLabUI.click(drpDwnEmployeeName);
    }

    public void clickSearchButton(){
         syscoLabUI.click(btnSearch);
    }

    public boolean availabilityOfEmployee(){
        return syscoLabUI.isDisplayed(firstRow);
    }

    public void selectAllEmployees(){
        syscoLabUI.click(chkSelectAll);
    }

    public void clickDeleteButton(){
        syscoLabUI.click(btnDelete);
    }

    public void clickConfirmDeleteion(){
        syscoLabUI.click(btnConfirmDelete);
    }

}
