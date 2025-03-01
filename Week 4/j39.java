class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 101),
            new Employee("Bob", 102),
            new Employee("Charlie", 103)
        };

        for (Employee emp : employees) {
            emp.display();
        }
    }
}

