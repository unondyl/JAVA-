
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
    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Employee salary: " + this.salary);
        System.out.println("Employee department: " + this.department);
    }
}
