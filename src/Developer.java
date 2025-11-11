public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name,int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }


    public void work() {
        System.out.println(getName() + " scrie cod în " + programmingLanguage + ".");
    }
}