package com.sysco.orangehrm.page;

import org.openqa.selenium.By;
import java.util.List;

public class LeaveListPage extends LoginPage{

    protected By txtEmployeeName = By.id("leaveList_txtEmployee_empName");
    protected By btnSearch = By.id("btnSearch");
    protected By trLeaveListRow = By.xpath("//*[@id='resultTable']/tbody/tr");

    public void setEmployeeName(String employeeName){
        syscoLabUI.sleep(2);
        syscoLabUI.sendKeys(txtEmployeeName, employeeName);
    }

    public void clickSearch(){
        syscoLabUI.sleep(2);
        syscoLabUI.click(btnSearch);
    }

    public boolean availabilityOfRow(){
        return syscoLabUI.isDisplayed(trLeaveListRow);
    }

    public int getCountOfRows(){
        List rows = syscoLabUI.findElements(trLeaveListRow);
        return rows.size();
    }
}
