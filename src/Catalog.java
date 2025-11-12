import java.util.HashMap;

public class Catalog {
    private HashMap<String, Student> students = new HashMap<>();

    public void addStudent(String name) {
        if (!students.containsKey(name)) {
            students.put(name, new Student(name));
            System.out.println("Student " + name + " adăugat în catalog.");
        } else {
            System.out.println("Studentul " + name + " există deja.");
        }
    }

    public void addGrade(String name, int grade) {
        Student s = students.get(name);
        if (s != null) {
            s.addGrade(grade);
        } else {
            System.out.println("Studentul " + name + " nu există!");
        }
    }

    public void showAll() {
        System.out.println("\n=== Catalog Studenți ===");
        for (Student s : students.values()) {
            s.showGrades();
        }
    }
}
