public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.fullList();
        System.out.println("Сумма затрат на зарплаты в месяц: " + employeeBook.salarySumm());
        employeeBook.minSalary();
        employeeBook.maxSalary();
        employeeBook.averageSalary();
        employeeBook.fullNames();
        employeeBook.indexingSalary(-10);
        employeeBook.minDepartmentSalary(2);
        employeeBook.maxDepartmentSalary(2);
        employeeBook.allDepartmentSalary(2);
        employeeBook.averageDepartmentSalary(2);
        employeeBook.indexingDepartmentSalary(2, 10);
        employeeBook.departmentList(2);
        employeeBook.salaryLessThen(30000);
        employeeBook.salaryMoreThen(30000);
        employeeBook.addNewEmployee("Петров Петр петрович", 6, 22000);
        employeeBook.addNewEmployee("Антонов Антон Антонович", 4, 27000);
        employeeBook.dismissalEmployee(3, "Александров Александр Александрович");
        employeeBook.changeEmployee("Петров Петр петрович", 0, 25000);
        employeeBook.listByDepartment();
    }
}