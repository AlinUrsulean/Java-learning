public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int age, double salary, int teamSize) {
        super(name,age,salary);
        this.teamSize = teamSize;
    }
}
