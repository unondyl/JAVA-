package Steam_Student;

import java.io.*;

public class Student extends Person{
    private String email, id ,GPA;

    @Override
    public void inp() throws IOException {;
        super.inp();
        BufferedReader bur  = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("email :");email = bur.readLine();
        System.out.print("ID student: ");id = bur.readLine();
        System.out.print("GPA: ");GPA=bur.readLine();
    }

    @Override
    public void out(DataOutputStream dos, int inter) throws IOException {
        super.out(dos, inter);
        dos.writeUTF(id+"\t|"+GPA+"\t|\n");
    }
}
