public class Main {
    public static void main(String[] args) {

        Worker abstractWorker = new Worker("Иван", "Иванов", "безработный");
        abstractWorker.goToWork();
        abstractWorker.goToVacation(3);

        Programmer programmer = new Programmer("Олег", "Игонин", "Програмссит");
        programmer.goToWork();
        programmer.goToVacation(12);

        DevOps devOps = new DevOps("Александр", "Григорьев", "DevOps");
        devOps.goToWork();
        devOps.goToVacation(16);

        SysAdmin sysAdmin = new SysAdmin("Jhon", "Smith", "Сисадмин");
        sysAdmin.goToWork();
        sysAdmin.goToVacation(21);

        Tester tester = new Tester("Илья", "Яковлев", "Тестировщик");
        tester.goToWork();
        tester.goToVacation(31);

    }
}
