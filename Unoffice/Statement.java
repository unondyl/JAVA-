import java.util.Scanner;

public class Statement {

	private static int checkyear(int n, int month)
	{
		int m[] = new int [13];
		m[1]=m[3]=m[5]=m[7]=m[8]=m[10]=m[12]=31;
		m[4]=m[6]=m[9]=m[11]=30; 
		m[2]=28;
		if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
			m[2] = 29; // Leap year
		}	
		return m[month % 13];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = sc.nextInt(), month = sc.nextInt();
		sc.close();
		System.out.println(checkyear(year, month));
	}
}