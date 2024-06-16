public class Tester extends Worker {
    int beginWork = 8;
    int endWork = 17;

    public Tester(String name, String lastname, String profession) {
        super(name, lastname, profession);
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("Рабочий день Тестера начинается в " + this.beginWork + " часов,");
        System.out.println("а закончится в " + this.endWork + " часов.");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Тестировщики отдыхают в Геленджике.");
        System.out.println();
    }
}
