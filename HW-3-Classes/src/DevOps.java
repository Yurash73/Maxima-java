public class DevOps extends Worker {
    int beginWork = 12;
    int endWork = 20;

    public DevOps(String name, String lastname, String profession) {
        super(name, lastname, profession);
    }

    @Override
    public void goToWork() {
        super.goToWork();
        System.out.println("Рабочий день DevOpsa начинается в " + this.beginWork + " часов,");
        System.out.println("а закончится в " + this.endWork + " часов.");
    }

    @Override
    public void goToVacation(int days) {
        super.goToVacation(days);
        System.out.println("DevOps-ы отдыхают в Тайланде!");
        System.out.println();
    }
}
