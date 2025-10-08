package Steam_Student;

import java.io.*;

public class Student extends Person{
    private String email, id ,GPA;
    public Student(String name, String birth,String address, String sex, String email,String id,String GPA ){
        super(name,birth,address,sex);
        this.email=email;
        this.id=id;
        this.GPA=GPA;
    }

    @Override
    public void inp() throws IOException {;
        super.inp();
        BufferedReader bur  = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("email :");email = bur.readLine();
        System.out.print("ID student: ");id = bur.readLine();
        System.out.print("GPA: ");GPA=bur.readLine();
    }


    public void out(ObjectOutputStream dos) throws IOException {
        super.out(dos);
        dos.writeObject(id+" \t|"+email+" \t|"+GPA+"\n");
    }

    public void out(BufferedWriter dos) throws IOException {
        super.out(dos);
        dos.write(id+" \t|"+email+" \t|"+GPA+"\n");
    }

    @Override
    public void out2() {
        super.out2();
        System.out.println(id);
    }
    // Get All

    public String getEmail() {
        return email;
    }

    public String getGPA() {
        return GPA;
    }

    public String getId() {
        return id;
    }
    //    public static class Manager extends JFrame {
//        //Form
//        private JTextField id;
//        private JTextField email;
//        private JTextField GPA;
//        private JButton saveButton;
//
//        public Manager(){
//            setContentPane(Manager);
//            setTitle("Main");
//            setDefaultCloseOperation(EXIT_ON_CLOSE);
//            setLocationRelativeTo(null);
//            saveButton.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//
//                }
//            });
//        }
//
//        public static int E_choice(){
//            Scanner sc= new Scanner(System.in);
//            System.out.println("Enter choice: \n 1.Add\n 2.Save file ane Return");
//            int tmp = sc.nextInt();sc.nextLine();
//            return tmp;
//        }
//        private void createUIComponents() {
//            // TODO: place custom component creation code here
//        }
//
//
//        // Code
//        public static void main(String[] args) throws IOException {
//            new Manager();
//            File f = new File("D:\\actvn\\JAVA\\data.dat");
//            FileOutputStream fos= new FileOutputStream(f);
//            DataOutputStream dos = new DataOutputStream(fos);
//            Person stu;int inter=1;
//            while(true){
//                switch (E_choice()){
//                    case 1:
//                        stu = new Student();
//                        stu.inp();
//                        stu.out(dos,inter++);
//                        break;
//                    case 2:
//                        dos.close();
//                        return;
//                }
//            }
//        }
}
