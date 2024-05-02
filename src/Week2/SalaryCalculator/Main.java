package Week2.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali", 2000, 45, 1985);
        employee1.raiseSalary();
        employee1.bonus();
        employee1.tax();
        employee1.totalSalary();
        employee1.print();
    }
}
