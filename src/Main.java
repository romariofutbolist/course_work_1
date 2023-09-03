public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.add(new Employee("Ivanov Ivan", 1, 60000.00));
        employeeBook.add(new Employee("Ivanov Sergey", 2, 78000.00));
        employeeBook.add(new Employee("Samokhina Alena", 1, 43000.00));
        employeeBook.add(new Employee("Sidorov Peter", 3, 100000.00));
        employeeBook.add(new Employee("Grigoriev Matvei", 3, 102000.00));
        employeeBook.add(new Employee("Pizhov Leonid", 4, 45000.00));
        employeeBook.add(new Employee("Artemev Roman", 5, 89000.00));
        employeeBook.add(new Employee("Nikolaev Alex", 4, 38000.00));
        employeeBook.add(new Employee("Kirillov Andrei", 2, 77000.00));
        employeeBook.add(new Employee("Dimova Elena", 5, 79000.00));


        //employeeBook.delete("Sidorov Peter");

        //employeeBook.updateSalary("Samokhina Alena", 70000.00);
        //employeeBook.updateDepartment("Artemev Roman", 2);

        //employeeBook.printInfo();

        //employeeBook.printOnlyName();
        employeeBook.nameOfEmployeeInDepartment();

    }

}
