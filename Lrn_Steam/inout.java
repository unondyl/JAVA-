package Lrn_Steam;

import java.io.*;

public class inout {
    public static void main(String []ags) throws IOException {
        File f  = new File("data.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos  = new DataOutputStream(fos);
        dos.writeInt(3618);
        dos.writeUTF("TH truemilk");
        dos.close();
        FileInputStream fis= new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
    }
}

