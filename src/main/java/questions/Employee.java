package questions;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Working");
    }

    public void takeBreak() {
        System.out.println("Taking a break");
    }
}