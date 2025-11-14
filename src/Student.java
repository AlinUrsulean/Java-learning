import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            grades.add(grade);
        } else {
            System.out.println("Nota invalidă pentru " + name);
        }
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    public void showGrades() {
        System.out.println(name + " → " + grades + " | Medie: " + getAverage());
    }

    // Convertim studentul în format CSV (ex: Andrei,10,9,8)
    public String toCSV() {
        StringBuilder sb = new StringBuilder(name);
        for (int g : grades) {
            sb.append(",").append(g);
        }
        return sb.toString();
    }

    // Reconstruim studentul dintr-o linie CSV
    public static Student fromCSV(String line) {
        String[] parts = line.split(",");
        Student s = new Student(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            try {
                s.addGrade(Integer.parseInt(parts[i]));
            } catch (NumberFormatException e) {
                System.out.println("Eroare la citirea notei pentru " + parts[0]);
            }
        }
        return s;
    }
}
