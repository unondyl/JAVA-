
public class Employee extends Person{
    private double salary;
    private String department;
    public void setSalary(double salary) {
        this.salary = salary;
        System.out.println("Salary set to " + salary);
    }
    public void setDepartment(String department) {

        this.department = department;
        System.out.println(this.department);
    }
    public void outPut() {
        //super.outPut();
        System.out.println("Employee salary: " + this.salary);
        System.out.println("Employee department: " + this.department);
    }
}
