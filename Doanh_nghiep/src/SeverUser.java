//*****         ***
//******       ***
//***  ***    ***
//***   ***  ***
//***    ******
//***     ***code
//***    *** by
//***   **** dyl
// *** *****************
//*******************

import java.util.ArrayList;
import java.util.Scanner;

public class SeverUser extends CanBo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<CanBo> list=new ArrayList<CanBo>();
        int nTmp=sc.nextInt();
        while (nTmp!=4)
        {
            if(nTmp==1)
            {
                CanBo b= new CongNhan("Jonh","dsa","123","123123","sdf");
                list.add(b);
                b=new NhanVien("Jack","boy","123","123123","sdf");
                list.add(b);
                b= new CongNhan("Nghiia","23134","32cs","36","a");
                list.add(b);
            }
            if (nTmp==2)
            {
                for (CanBo c : list)
                    {
                        c.OutPrint();
                    }
            }

            nTmp= sc.nextInt();
        }
    }
}