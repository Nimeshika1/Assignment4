package com.sysco.orangehrm.page;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;


public class ApplyLeavePage extends LoginPage{
    protected By drpDwnLeaveType = By.xpath("//*[@id='applyleave_txtLeaveType']//*[@value='2']");
    protected By lblLeaveBalance = By.id("applyleave_leaveBalance");
    protected By txtStartDate = By.id("applyleave_txtFromDate");
    protected By btnNext = By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']");
    protected By btnStartDate = By.xpath("//*[@class= 'ui-datepicker-calendar']/tbody/tr[3]/td[1]/a");
    protected By btnApply = By.id("applyBtn");

    public void selectLeaveType(){
        syscoLabUI.click(drpDwnLeaveType);
    }

    public String getLeaveBalance(){
        String leaveBalance = syscoLabUI.getText(lblLeaveBalance);
        List<String> allMatches = new ArrayList<String>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(leaveBalance);
        while(m.find()) {
            allMatches.add(m.group());
        }
        return allMatches.get(0);
    }

    public void selectStartDate(String leaveBalance){
        int avaialableLeaves = Integer.parseInt(leaveBalance);
        if(avaialableLeaves >= 1){
            syscoLabUI.click(txtStartDate);
            syscoLabUI.click(btnNext);
            syscoLabUI.sleep(1);
            syscoLabUI.click(btnStartDate);

        }
    }

    public void clickApplyBtn(){
        syscoLabUI.click(btnApply);
    }

}
