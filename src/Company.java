import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println(e.getName() + " a fost adăugat în companie.");
    }

    public void showAllEmployees() {
        System.out.println("\n=== Lista Angajaților ===");
        for (Employee e : employees) {
            System.out.println(e.getName() + " - " + e.getSalary() + " RON");
        }
    }

    public void startWorkDay() {
        System.out.println("\n=== Zi de lucru începută ===");
        for (Employee e : employees) {
            e.work();
        }
    }
}
