package lab_11_k.Bai1;

import java.util.Scanner;

public class demo {
    public static void main (String[] args) throws Exception{
        MyStack stack = new MyStack(20);
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if(!stack.full()){
                stack.put(sc.next());
            }
            else {
                throw new Exception("Stack Full");
            }
        }
        System.out.println("GET ");
        n= sc.nextInt();;
        for(;n>0;n--){
            if (stack.empty()){
                throw new Exception("Stack Empty ");
            }
            else {
                System.out.println(stack.get(n));
            }
        }
    }
}
