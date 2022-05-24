public class EmployeeBook {

    private Employee[] employees = new Employee[10];

    public EmployeeBook() {

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

    }

    public void fullList() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i]);
            }
        }
    }

    public int salarySumm(){
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                summ = summ + employees[i].getSalary();
            }
        }
        return summ;
    }

    public void minSalary() {
        int min = 999999999;
        int counter = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && min > employees[i].getSalary()){
                min = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employees[counter]);
    }

    public void maxSalary() {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && max < employees[i].getSalary()){
                max = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employees[counter]);
    }

    public void averageSalary(){
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                counter += 1;
            }
        }
        System.out.println("Средняя зарплата: "+ salarySumm()/counter);
    }

    public void fullNames() {
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public void indexingSalary(int percent) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                int salary = employees[i].getSalary();
                employees[i].setSalary(salary + salary / 100 * percent );
            }
        }
    }

    public void minDepartmentSalary(int department) {
        int min = 999999999;
        int counter = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department && min > employees[i].getSalary()){
                min = employees[i].getSalary();
                counter = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + ": " + employees[counter]);
    }

    public void maxDepartmentSalary(int department) {
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

    public void allDepartmentSalary(int department) {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department){
                summ = summ + employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу " + department + ": " + summ);
    }

    public void averageDepartmentSalary(int department) {
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

    public void indexingDepartmentSalary(int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == department){
                int salary = employees[i].getSalary();
                employees[i].setSalary(salary + salary / 100 * percent );
            }
        }
    }

    public void departmentList(int department) {
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

    public void salaryLessThen(int summ) {
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

    public void salaryMoreThen(int summ) {
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

    public void addNewEmployee(String fullName, int department, int salary) {
        boolean done = false;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = new Employee(fullName, department, salary);
                System.out.println("Назначен новый сотрудник: " + employees[i]);
                done = true;
                break;
            }
        }
        if(!done) {
            System.out.println("Вы не можете добавить нового сотрудника. Сначала нужно кого-то уволить.");
        }
    }

    public void dismissalEmployee(int id, String fullName) {
        boolean done = false;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null &&
                ((employees[i].getFullName().equals(fullName) && employees[i].getId() == id) ||
                (employees[i].getFullName().equals(fullName) && id == 0) ||
                (fullName.equals("") && employees[i].getId() == id))
            ){
            employees[i] = null;
                System.out.println("Сотрудник " + fullName + " уволен.");
                done = true;
                break;
            }
        }
        if(!done) {
            System.out.println("Сотрудник с указанными данными не найден.");
        }
    }

    public void changeEmployee(String fullName, int department, int salary) {
        boolean done = false;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getFullName().equals(fullName)){
                if(department != 0){
                    employees[i].setDepartment(department);
                }
                if(salary != 0){
                    employees[i].setSalary(salary);
                }
                System.out.println("Изменения внесены: " + employees[i]);
                done = true;
                break;
            }
        }
        if(!done) {
            System.out.println("Сотрудник с указанными данными не найден.");
        }
    }

    public void listByDepartment() {
        int counter = 0;
        for (int d = 1; d <= employees.length; d++) {
            for (int i = 0; i < employees.length; i++) {
                if(employees[i] != null && employees[i].getDepartment() == d){
                    if(counter == 0){
                        System.out.println("Список сотрудников отдела " + d + ":");
                        counter++;
                    }
                    System.out.println(employees[i].getFullName());
                }
            }
            counter = 0;
        }
    }
}
