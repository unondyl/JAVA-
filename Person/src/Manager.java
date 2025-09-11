public class Manager extends Employee {
    public Manager() {
    }
    //public Manager(String firstName, String lastName, double salary) {}
    int level;
    public void setLevel(int level){
        this.level = level;
    }
    public void getDetail() {
        super.getDetail();
        //System.out.println("Manager level: " + this.level);
    }
    public static  void main(String[] args)
    {
        Employee emp = new Employee();
        Employee ee=(Employee)emp;
        ee.setName("Johf");
        ee.setSalary(845474);
        ee.getDetail();
    }
}
