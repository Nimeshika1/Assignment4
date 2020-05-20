package com.sysco.orangehrm.function;

import com.sysco.orangehrm.page.EmployeeListPage;

public class EmployeeList extends EmployeeListPage {
    static EmployeeList employeeList = new EmployeeList();

    public static void searchEmployeeName(String employeeName){
        employeeList.searchEmployeee(employeeName);
        employeeList.selectEmployeeName();
        employeeList.clickSearchButton();
    }

    public static boolean isAvailableEnteredEmployee(){
        return employeeList.availabilityOfEmployee();
    }

    public static void deleteSelectedEmployee(){
        employeeList.selectAllEmployees();
        employeeList.clickDeleteButton();
        syscoLabUI.sleep(2);
        employeeList.clickConfirmDeleteion();
        syscoLabUI.sleep(2);
    }


}
