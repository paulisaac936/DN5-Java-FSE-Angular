public class EmployeeManagement {

    Employee[] employees = new Employee[100];
    int size = 0;

    // Add Employee
    void addEmployee(Employee emp) {
        employees[size] = emp;
        size++;
    }

    // Search Employee
    Employee searchEmployee(int id) {

        for(int i = 0; i < size; i++) {

            if(employees[i].employeeId == id) {
                return employees[i];
            }
        }

        return null;
    }

    // Traverse Employees
    void displayEmployees() {

        for(int i = 0; i < size; i++) {
            employees[i].display();
        }
    }

    // Delete Employee
    void deleteEmployee(int id) {

        int index = -1;

        for(int i = 0; i < size; i++) {

            if(employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Employee Not Found");
            return;
        }

        for(int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        size--;
    }

    public static void main(String[] args) {

        EmployeeManagement em =
            new EmployeeManagement();

        em.addEmployee(
            new Employee(
                101,
                "Isaac",
                "Developer",
                50000
            )
        );

        em.addEmployee(
            new Employee(
                102,
                "John",
                "Tester",
                40000
            )
        );

        System.out.println("Employees:");

        em.displayEmployees();

        System.out.println("\nSearch:");

        Employee emp =
            em.searchEmployee(101);

        if(emp != null)
            emp.display();

        em.deleteEmployee(102);

        System.out.println("\nAfter Delete:");

        em.displayEmployees();
    }
}