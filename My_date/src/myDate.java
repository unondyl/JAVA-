//*****       ***
//*** ***    ***
//***  ***  ***
//***   ******
//***    ***
//***   ***  dyl
//***  ***************
//*******************/
import java.util.Scanner;

public class myDate{
    
    private int day, month, year;
    public myDate(){

    }
    public myDate(myDate d)
    {
        day   = d.day;
        month = d.month;
        year  = d.year;
    }
    public void inputDate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add Date: ");
        day = sc.nextInt(); month =sc.nextInt(); year=sc.nextInt();
    }
    public void outputDate()
    {
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}