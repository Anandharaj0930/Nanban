package org.emp;

public class Employee {

    private void empId(){
        System.out.println("Calling Employee Id");
    }
    private void empName() {
        System.out.println("Calling Employee Name");
    }

    private void empDob() {
        System.out.println("Calling Employee DOB");
    }

    private void empPhone() {
        System.out.println("Calling Employee Phone");
    }

    private void empEmail() {
        System.out.println("Calling Employee Email");
    }

    private void empAddress() {
        System.out.println("Calling Employee Address");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empId();
        employee.empName();
        employee.empDob();
        employee.empPhone();
        employee.empEmail();
        employee.empAddress();
    }
}
