public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Степанов Степан Степанович", 1, 23000);
        employees[1] = new Employee("Егоров Егор Егорович", 1, 23700);
        employees[2] = new Employee("Александров Александр Александрович", 2, 36700);
        employees[3] = new Employee("Евгеньев Евгений Евгеньевич", 2, 35000);
        employees[4] = new Employee("Антонов Антон Антонович", 3, 18700);
        //employees[5] = new Employee("Семенов Семен Семенович", 3, 20000);
        employees[6] = new Employee("Аркадьев Аркадий Аркадьевич", 4, 23800);
        employees[7] = new Employee("Владимиров Владимир Владимирович", 4, 24000);
        employees[8] = new Employee("Васильев Василий Васильевич", 5, 53000);
        employees[9] = new Employee("Николаев Николай Николаевич", 5, 58300);

        fullList(employees);
        System.out.println("Сумма затрат на зарплаты в месяц: " + salarySumm(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[minSalary(employees)]);
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[maxSalary(employees)]);
        System.out.println("Средняя зарплата: " + averageSalary(employees));
        fullNames(employees);
        indexingSalary(employees, -10);
        minDepartmentSalary(employees, 2);
        maxDepartmentSalary(employees, 2);
        allDepartmentSalary(employees, 2);
        averageDepartmentSalary(employees, 2);
        indexingDepartmentSalary( employees, 2, 10);
        departmentList(employees, 2);
        salaryLessThen(employees, 30000);
        salaryMoreThen(employees, 30000);
    }

    public static void fullList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i]);
            }
        }
    }

    public static int salarySumm(Employee[] employees) {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                summ = summ + employees[i].getSalary();
            }
        }
        return summ;
    }

    public static int minSalary(Employee[] employees) {
        int min = 500000;
        int counter = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && min > employees[i].getSalary()){
                min = employees[i].getSalary();
                counter = i;
            }
        }
        return counter;
    }

    public static int maxSalary(Employee[] employees) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && max < employees[i].getSalary()){
                max = employees[i].getSalary();
                counter = i;
            }
        }
        return counter;
    }

    public static int averageSalary(Employee[] employees){
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                counter += 1;
            }
        }
        return salarySumm(employees)/counter;
    }

    public static void fullNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public static void indexingSalary(Employee[] employees, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                int salary = employees[i].getSalary();
                employees[i].setSalary(salary + salary / 100 * percent );
            }
        }
    }

    public static void minDepartmentSalary(Employee[] employees, int department) {
        int min = 500000;
        int counter = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department && min > employees[i].getSalary()){
                min = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + employees[counter]);
    }

    public static void maxDepartmentSalary(Employee[] employees, int department) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department && max < employees[i].getSalary()){
                max = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой в отделе " + department + ": " + employees[counter]);
    }

    public static void allDepartmentSalary(Employee[] employees, int department) {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department){
                summ = summ + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу " + department + ": " + summ);
    }

    public static void averageDepartmentSalary(Employee[] employees, int department) {
        int summ = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department){
                summ = summ + employees[i].getSalary();
                counter++;
            }
        }
        System.out.println("Средняя зарплата по отделу " + department + ": " + (summ / counter));
    }

    public static void indexingDepartmentSalary(Employee[] employees, int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department){
                int salary = employees[i].getSalary();
                employees[i].setSalary(salary + salary / 100 * percent );
            }
        }
    }

    public static void departmentList(Employee[] employees, int department) {
        System.out.println("Список сотрудников отдела " + department + ":");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department){
                System.out.println("id=" + employees[i].getId() +
                        ", fullName='" + employees[i].getFullName() + '\'' +
                        ", department=" + employees[i].getDepartment() +
                        ", salary=" + employees[i].getSalary()
                );
            }
        }
    }

    public static void salaryLessThen(Employee[] employees, int summ) {
        System.out.println("Список сотрудников с зарплатой менее " + summ + ":");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getSalary() < summ){
                System.out.println("id=" + employees[i].getId() +
                        ", fullName='" + employees[i].getFullName() + '\'' +
                        ", salary=" + employees[i].getSalary()
                );
            }
        }
    }

    public static void salaryMoreThen(Employee[] employees, int summ) {
        System.out.println("Список сотрудников с зарплатой более или равной " + summ + ":");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getSalary() >= summ){
                System.out.println("id=" + employees[i].getId() +
                        ", fullName='" + employees[i].getFullName() + '\'' +
                        ", salary=" + employees[i].getSalary()
                );
            }
        }
    }

}