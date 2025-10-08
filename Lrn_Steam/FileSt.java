package Lrn_Steam;

import java.io.*;
import java.sql.SQLOutput;

public class FileSt{
    public static void main(String []args) throws IOException {
        File f = new File ("data.txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("#2MX");
        pw.println("sgfyiwgfihsdkfgiars");
        pw.close();
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String tmp= "";
        while ((tmp=br.readLine())!= null){
            System.out.println(tmp);
        }
    }
}
