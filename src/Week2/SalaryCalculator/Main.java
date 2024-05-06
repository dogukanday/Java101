package Week2.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali", 2000, 45, 1985);
        employee1.calculate();
        System.out.println(employee1);
    }
}
