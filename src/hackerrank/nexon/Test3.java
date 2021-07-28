package hackerrank.nexon;


abstract class Employee {
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();
    private void label() {
        System.out.println("Employee's data:");
    }
}

class Engineer extends Employee {

    private int salary;
    private String grade;

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getGrade() {
        return grade;
    }

}

class Manager extends Employee {

    private int salary;
    private String grade;

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    String getGrade() {
        return grade;
    }
}


public class Test3 {
}
