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

}