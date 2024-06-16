public class SysAdmin extends Worker {
    int beginWork = 8;
    int endWork = 21;

    public SysAdmin(String name, String lastname, String profession) {
        super(name, lastname, profession);
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("Рабочий день СисАдмина начинается в " + this.beginWork + " часов,");
        System.out.println("а закончится в " + this.endWork + " часов.");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("Сисадимины отдыхают в Сочи.");
        System.out.println();
    }
}