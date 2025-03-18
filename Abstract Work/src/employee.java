public class employee extends team {
    private final String details;

    public employee(String name, String title, String details) {
        super(name, title);
        this.details = details;

    }

    @Override
    public void printInfo() {
        System.out.println("Employee Name:- " + name + "Employee title:- " + title + "Employee details:- " + details);
    }
}
