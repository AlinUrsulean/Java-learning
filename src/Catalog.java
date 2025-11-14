import java.io.*;
import java.util.HashMap;

public class Catalog {
    private HashMap<String, Student> students = new HashMap<>();
    private final String fileName = "catalog.csv";

    public void addStudent(String name) {
        if (!students.containsKey(name)) {
            students.put(name, new Student(name));
            System.out.println("Student " + name + " adăugat.");
        } else {
            System.out.println("Studentul există deja!");
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

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student s : students.values()) {
                writer.write(s.toCSV());
                writer.newLine();
            }
            System.out.println("Catalog salvat în fișier!");
        } catch (IOException e) {
            System.out.println("Eroare la salvare: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        students.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student s = Student.fromCSV(line);
                students.put(s.getName(), s);
            }
            System.out.println("Catalog încărcat din fișier!");
        } catch (IOException e) {
            System.out.println("Nu s-a putut încărca catalogul (probabil fișierul nu există).");
        }
    }
}
