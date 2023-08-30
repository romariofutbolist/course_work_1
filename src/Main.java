public class Main {

    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("Ivanov Ivan", 1, 60000.00);
        employee[1] = new Employee("Ivanov Sergey", 2, 78000.00);
        employee[2] = new Employee("Samokhina Alena", 1, 43000.00);
        employee[3] = new Employee("Sidorov Peter", 3, 100000.00);
        employee[4] = new Employee("Grigoriev Matvei", 3, 102000.00);
        employee[5] = new Employee("Pizhov Leonid", 4, 45000.00);
        employee[6] = new Employee("Artemev Roman", 5, 89000.00);
        employee[7] = new Employee("Nikolaev Alex", 4, 38000.00);
        employee[8] = new Employee("Kirillov Andrei", 2, 77000.00);
        employee[9] = new Employee("Dimova Elena", 5, 79000.00);

        printInfo();
        System.out.println(sum());
        System.out.println(min());
        System.out.println(max());
        System.out.println(average());
        printOnlyName();

    }

    public static void printInfo() {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static double sum() {
        double sum = 0.00;
        for (Employee value : employee) {
            sum += value.getSalary();
        }
        return sum;
    }

    public static Employee min() {
        Employee minEmployee = employee[0];
        for (Employee employee : employee) {
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static Employee max() {
        Employee maxEmployee = employee[0];
        for (Employee employee : employee) {
            if (employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double average() {
        return sum() / employee.length;
    }

    public static void printOnlyName() {
        for (Employee value : employee) {
            System.out.println(value.getName());
        }
    }
}
