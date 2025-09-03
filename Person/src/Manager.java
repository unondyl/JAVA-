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
        Person p = new Person();
        Manager m = new Manager();
        p.setName("Jeremy");
        p.setBirthday("1994-04-02");
        Employee e = new Employee();
        e.setSalary(3.0);
        e.setDepartment("Engineering");
        m.setLevel(2);
        //m.outPut();
        p.getDetail();
    }
}
