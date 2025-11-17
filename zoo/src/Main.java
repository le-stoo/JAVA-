


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocieteArrayList societe = new SocieteArrayList();
        int choice;

        do {
            System.out.println("\n========== Employee Management System ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by Name");
            System.out.println("3. Search Employee by Object");
            System.out.println("4. Remove Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addEmployee(scanner, societe);
                    break;
                case 2:
                    searchEmployeeByName(scanner, societe);
                    break;
                case 3:
                    searchEmployeeByObject(scanner, societe);
                    break;
                case 4:
                    removeEmployee(scanner, societe);
                    break;
                case 5:
                    societe.displayEmployee();
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addEmployee(Scanner scanner, SocieteArrayList societe) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name (Nom): ");
        String nom = scanner.nextLine();

        System.out.print("Enter Employee First Name (Prenom): ");
        String prenom = scanner.nextLine();

        System.out.print("Enter Department (Departement): ");
        String departement = scanner.nextLine();

        System.out.print("Enter Grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(id, nom, prenom, departement, grade);
        societe.ajouterEmployee(employee);
        System.out.println("Employee added successfully!");
    }

    private static void searchEmployeeByName(Scanner scanner, SocieteArrayList societe) {
        System.out.print("Enter Employee Name to search: ");
        String nom = scanner.nextLine();

        if (societe.rechercherEmployee(nom)) {
            System.out.println("Employee found!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void searchEmployeeByObject(Scanner scanner, SocieteArrayList societe) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name (Nom): ");
        String nom = scanner.nextLine();

        Employee employee = new Employee(id, nom, "", "", 0);

        if (societe.rechercherEmployee(employee)) {
            System.out.println("Employee found!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void removeEmployee(Scanner scanner, SocieteArrayList societe) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name (Nom): ");
        String nom = scanner.nextLine();

        Employee employee = new Employee(id, nom, "", "", 0);
        societe.supprimerEmployee(employee);
        System.out.println("Employee removed successfully!");
    }
}