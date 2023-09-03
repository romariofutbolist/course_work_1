public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void delete(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getName().equalsIgnoreCase(name)) {
                employees[i] = null;
                break;
            }
        }
    }

    public void updateSalary(String name, double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setSalary(salary);
                break;
            }
        }
    }

    public void updateDepartment(String name, int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setDepartment(department);
                break;
            }
        }
    }

    public void printInfo() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void printInfo(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println("name: " + employee.getName() + "salary:" + employee.getSalary());
            }
        }
    }

    public double sum() {
        double sum = 0.00;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public double sum(int department) {
        double sum = 0.00;
        for (Employee value : employees) {
            if (value == null) {
                continue;
            }
            if (department == value.getDepartment()) {
                sum += value.getSalary();
            }
        }
        return sum;
    }

    public Employee min() {
        Employee minEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public Employee min(int department) {
        Employee minEmployeeOfDepartment = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment() && (minEmployeeOfDepartment == null || employee.getSalary() < minEmployeeOfDepartment.getSalary())) {
                minEmployeeOfDepartment = employee;
            }
        }
        return minEmployeeOfDepartment;
    }

    public Employee max() {
        Employee maxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public Employee max(int department) {
        Employee maxEmployeeOfDepartment = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment() && (maxEmployeeOfDepartment == null || employee.getSalary() > maxEmployeeOfDepartment.getSalary())) {
                maxEmployeeOfDepartment = employee;
            }
        }
        return maxEmployeeOfDepartment;
    }

    public double average() {
        double sum = 0.00;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
            count++;
        }
        return sum / count;
    }

    public double average(int department) {
        double sum = 0.00;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (department == employee.getDepartment()) {
                sum += employee.getSalary();
                count++;
            }
        }
        return sum / count;
    }

    public void printOnlyName() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getName());
        }
    }

    public void printOnlyName(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexSalary(double percent) {
        for (Employee value : employees) {
            if (value == null) {
                continue;
            }
            double indexSalary = value.getSalary() * percent / 100 + value.getSalary();
            System.out.println(indexSalary);
        }
    }

    public void indexSalaryOfDepartment(double percent, int department) {
        for (Employee value : employees) {
            if (value == null) {
                continue;
            }
            if (department == value.getDepartment()) {
                double indexSalary = value.getSalary() * percent / 100 + value.getSalary();
                System.out.println(indexSalary);
            }
        }
    }

    public void employeeSalaryLessThen(double salary) {
        for (Employee value : employees) {
            if (value == null) {
                continue;
            }
            if (salary < value.getSalary()) {
                System.out.println("id: " + value.getId() + " name: " + value.getName() + " salary: " + value.getSalary());
            }
        }
    }

    public void employeeSalaryMoreThen(double salary) {
        for (Employee value : employees) {
            if (value == null) {
                continue;
            }
            if (salary >= value.getSalary()) {
                System.out.println("id: " + value.getId() + " name: " + value.getName() + " salary: " + value.getSalary());
            }
        }
    }

    public void nameOfEmployeeInDepartment() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сотрудники из отдела " + i);
            printOnlyName(i);
        }
    }
}
