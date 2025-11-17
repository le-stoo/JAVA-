import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Employee> {
    private ArrayList<Employee> employees;

    public SocieteArrayList() {
        this.employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public boolean rechercherEmployee(String nom) {
        for (Employee employee : employees) {
            if (employee.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmployee(Employee employee) {
        return employees.contains(employee);
    }

    @Override
    public void supprimerEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void displayEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
