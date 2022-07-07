public class Deveper extends Employee{

    public Deveper(int age, String name, double salary) {
        super(age, name, salary);
    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public void print() {
        System.out.println("========================");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.salary);
    }
}
