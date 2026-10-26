
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Employee> Employees = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee By ID");
            System.out.println("4. Update Employee By ID");
            System.out.println("5. Delete Employee By ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewAllEmployees();
                    break;

                case 3:
                    searchEmployee(sc);
                    break;

                case 4:
                    updateEmployee(sc);
                    break;

                case 5:
                    deleteEmployee(sc);
                    break;

                case 6:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    static void addEmployee(Scanner sc) {
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee email: ");
        String email = sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        Employee emp = new Employee(
            id, name, email, department, salary
        );

        Employees.add(emp);
        System.out.println("Employee added successfully!");
    }

    static void viewAllEmployees() {
        if (Employees.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        for (Employee emp : Employees) {
            System.out.println("------------------------");
            emp.displayDetails();
        }
    }

    static void searchEmployee(Scanner sc) {
        System.out.print("Enter employee ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Employee emp : Employees) {
            if (emp.getId() == searchId) {
                System.out.println("Employee found!");
                emp.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    static void updateEmployee(Scanner sc) {
        System.out.print("Enter employee ID to update: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (Employee emp : Employees) {
            if (emp.getId() == searchId) {
                System.out.println("Employee found!");
                emp.displayDetails();

                System.out.print("Enter new name: ");
                String name = sc.nextLine();

                System.out.print("Enter new email: ");
                String email = sc.nextLine();

                System.out.print("Enter new department: ");
                String department = sc.nextLine();

                System.out.print("Enter new salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                emp.setName(name);
                emp.setEmail(email);
                emp.setDepartment(department);
                emp.setSalary(salary);

                System.out.println("Employee updated successfully!");
                emp.displayDetails();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    static void deleteEmployee(Scanner sc) {
        System.out.print("Enter employee ID to delete: ");
        int deleteId = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < Employees.size(); i++) {
            Employee emp = Employees.get(i);

            if (emp.getId() == deleteId) {
                Employees.remove(i);
                System.out.println("Employee deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }
    }
 

// Add the helper method here
static boolean employeeExists(int id) {
    for (Employee emp : Employees) {
        if (emp.getId() == id) {
            return true;
        }
    }
    return false;
}

} // End of Main class






//           /* */ System.out.print("How many employees do you want to add? ");
//         int n = sc.nextInt();
//         sc.nextLine();

//         for (int i = 1; i <= n; i++) {

//             System.out.println("\nEnter details of employee " + i);

//           System.out.print("enter employee ID: ");
//           int id = sc.nextInt();
//           sc.nextLine();

//            System.out.print("Enter employee name: ");
//           String name = sc.nextLine();

//           System.out.print("Enter employee email:");
//           String email = sc.nextLine();

//            System.out.print("Enter department: ");
//         String department = sc.nextLine();

//         System.out.print("Enter salary: ");
//         double salary = sc.nextDouble();
   
//         employee emp = new employee(id,name,email,department,salary);

//         employees.add(emp);

//           System.out.println("\nEmployee added successfully!");
//         }
//         System.out.println("Total employees: " + employees.size());

//         for(employee e : employees){
//             System.out.println("-----------------");
//             e.displayDetails();
//         }
//         sc.close();
//     }
// }*/

       