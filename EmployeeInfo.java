public class EmployeeInfo {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "123 Main St", 80000);
        Developer developer = new Developer("Alice Smith", "456 Elm St", 60000);
        Programmer programmer = new Programmer("Bob Johnson", "789 Oak St", 50000);

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProject();

        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        developer.generatePerformanceReport();
        developer.manageProject();

        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());
        programmer.generatePerformanceReport();
        programmer.manageProject();
    }
}