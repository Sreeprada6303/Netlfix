import java.util.*;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Stack<Employee> employeeStack = new Stack<>();
        Queue<Employee> employeeQueue = new LinkedList<>();
        LinkedList<Employee> employeeList = new LinkedList<>();
        TreeMap<String, Employee> employeeTreeMap = new TreeMap<>();

        // Adding employees
        employeeStack.push(new Employee("John", 50000));
        employeeStack.push(new Employee("Jane", 60000));

        employeeQueue.add(new Employee("Alex", 55000));
        employeeQueue.add(new Employee("Alice", 58000));

        employeeList.add(new Employee("Bob", 52000));
        employeeList.add(new Employee("Betty", 59000));

        employeeTreeMap.put("David", new Employee("David", 53000));
        employeeTreeMap.put("Diana", new Employee("Diana", 56000));

        // Display employees using different data structures
        System.out.println("Employees in Stack:");
        while (!employeeStack.isEmpty()) {
            System.out.println(employeeStack.pop());
        }

        System.out.println("\nEmployees in Queue:");
        while (!employeeQueue.isEmpty()) {
            System.out.println(employeeQueue.poll());
        }

        System.out.println("\nEmployees in LinkedList:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("\nEmployees in TreeMap:");
        for (Map.Entry<String, Employee> entry : employeeTreeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
