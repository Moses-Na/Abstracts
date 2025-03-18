public class Company extends team{
    private final double Salary;

    public Company(String name, String title, double Salary) {
        super(name, title);
        this.Salary = Salary;
    }
    @Override
    public void printInfo(){
        System.out.println("Company name:- " + name + "Company title:- " + title + "Salary:-" + Salary);
    }
}

