public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }


    public double raiseSalary() {
        if ((2021 - this.hireYear) > 19) {
            return this.salary * 0.15;
        } else if ((2021 - this.hireYear > 9) && (2021 - this.hireYear < 20)) {
            return this.salary * 0.10;
        } else if ((2021 - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else {
            return 0;
        }
    }


    public void toString(Employee employee) {
        double total = this.salary - tax() + bonus() + raiseSalary();
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Weekly Workin Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Raise Salary : " + this.raiseSalary());
        System.out.println("Salary with raise salary and bonus\n(After tax deduction from salary) : " + total);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Emin KAVAK",2000,45,1985);

        employee.toString(employee);
    }
}
