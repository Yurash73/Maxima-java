public class Worker {

    private String name;
    private String lastname;
    private String profession;

    public Worker(String name, String lastname, String profession) {
        this.name = name;
        this.lastname = lastname;
        this.profession = profession;
    }

    public void goToWork() {

        System.out.println("Сотрудник " + this.name + " " + this.lastname +
                " идет на любимую работу ");
        System.out.println();

    }

    public void goToVacation(int days) {
        System.out.println(this.name + " " + this.lastname + "у ходит в отпуск на " +
                days + " дней.");
        System.out.println("Профессия  уходящего в отпуск " + this.profession);
        System.out.println();
    }

}