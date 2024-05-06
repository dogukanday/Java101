package Week2.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int hoursWorked;
    int hireYear;
    double tax;
    double bonus;
    double raise;
    double totalSalary;
    int year = 2021;

    public Employee(String name, double salary, int hoursWorked, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hoursWorked=" + hoursWorked +
                ", hireYear=" + hireYear +
                ", tax=" + tax +
                ", bonus=" + bonus +
                ", raise=" + raise +
                ", totalSalary=" + totalSalary +
                ", year=" + year +
                '}';
    }

    void raiseSalary() {
        if (year - hireYear < 10) {
            raise = salary * 0.05;
        }else if (year - hireYear > 9 && year - hireYear < 20) {
            raise = salary * 0.1;
        }else if(year - hireYear > 19) {
            raise = salary * 0.15;
        }
    }

    void bonus() {
        if (hoursWorked > 40) {
            bonus = (hoursWorked - 40) * 30;

        }
    }

    void tax() {
        if (salary > 1000) {
            tax = salary * 0.03;
        }else {
            tax = 0;
        }
    }
    void calculate(){
        raiseSalary();
        bonus();
        tax();
        totalSalary();
        print();
    }

    void totalSalary() {
        totalSalary = salary +raise + bonus - tax;
    }

    void print() {
        System.out.println("Adi: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalışma Saatı: " + hoursWorked);
        System.out.println("Başlangıç yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş artışı: " + raise);
        System.out.println("Vergi ve bonuslar ile maaş: " + (salary + bonus - tax));
        System.out.println("Toplam maaş: " + totalSalary);
    }


}
