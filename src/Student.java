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
}
