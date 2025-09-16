package lab_10_k_C1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExTest {
    public static void main(String []args) throws Exception {
        int a,b,c;
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader buf = new BufferedReader(reader);
            String str = buf.readLine();
            a = Integer.valueOf(str).intValue();
            str = buf.readLine();
            b = Integer.valueOf(str).intValue();
            str = buf.readLine();
            c = Integer.valueOf(str).intValue();
            QuadraticException e = new QuadraticException(a,b,c);
            e.slove();
        }
        catch (QuadraticException e){
            System.out.println(e.getMessage());
        }
    }
}
