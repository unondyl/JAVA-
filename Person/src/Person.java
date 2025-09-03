//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> i

public class Person {
    private String name, birthday;
    public void setName(String name){
        this.name = name;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void getDetail() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + birthday);
    }
}