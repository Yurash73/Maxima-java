public class Programmer extends Worker {
    int beginWork = 10;
    int endWork = 19;

    public Programmer(String name, String lastname, String profession) {
        super(name, lastname, profession);
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("Рабочий день ПРОГРАММИСТА начинается в " + this.beginWork + " часов,");
        System.out.println("а закончится в " + this.endWork + " часов.");
        System.out.println();

    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Программисты отдыхаю на Багамах");
    }
}