public class Main {
    public static void main(String[] args) {

        team[] team = {
                new Company("RestAssurance ", "Insurance Co. ", 300000.0),
                new employee("Shaggs ", "Insurance Manager", "Grad Stu") {
                    @Override
                    public void printInfo() {
                    }
                }
        };
    }
}