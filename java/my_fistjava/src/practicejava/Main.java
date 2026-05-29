package practicejava;
import java.util.Scanner;
public class Main{
	public static void main(String []args) {
		Scanner x =new Scanner(System.in);
		int totalBonus = 50000;
		System.out.print("Enter a Number of Employee: ");
		int totalEmployees=x.nextInt();
		shareBonus(totalBonus,totalEmployees);
		x.close();
	}
	public static void shareBonus(int bonus, int employees) {
		try {
			int av=bonus/employees;
			System.out.print("amount for per employee: "+av);
		}
		catch(ArithmeticException e){
			System.out.print("Error: Number of employees cannot be zero!");
		}
	}
}