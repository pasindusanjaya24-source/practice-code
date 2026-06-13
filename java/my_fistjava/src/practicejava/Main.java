package practicejava;
import java.util.Scanner;
public class Main{
	public static void main(String []args) {

		Scanner x =new Scanner(System.in);
		
		int totalBonus = 50000;
		System.out.println("Enter a Number of Employee: ");
		int totalEmployees=x.nextInt();
		x.nextLine();
		shareBonus(totalBonus,totalEmployees);
		
		//logging system
		
		System.out.println("\t======= Alert! ========");
		System.out.println("if you get more details,you will log in to system.please use the otp code for logging!");
		
		int m=generateotp();
		checkotp(m,x);
		
		
		
		x.close();
	}
	public static void shareBonus(int bonus, int employees) {
		try {
			int av=bonus/employees;
			System.out.println("amount for per employee: "+av);
		}
		catch(ArithmeticException e){
			System.out.println("Error: Number of employees cannot be zero!");
		}
	}
	public static int generateotp() {
		int otp_num=(int)(Math.random()*(999-100+1))+100;
		return otp_num;
		
	}
	public static void checkotp(int m,Scanner x) {
		boolean f=false;
		
		String otp_gen=String.valueOf(m);
        System.out.println("\nMasseage Alert!\nOTP Code:"+m+"\n======= !Warning! ====== :\nplease do not give that code.");
		
		int attempt=0;
		
		while(attempt<3){
			System.out.println("Enter your otp code: ");
			String otpcode=x.nextLine();
			if(otpcode.equals(otp_gen)) {
				System.out.println("Logging sucessfully!");
				f=true;
				break;
			}
			attempt++;
		}
		
		if(!f) {
			System.out.println("Wrong OTP!  you do not have more Attempts!.Try again!");
			
			checkotp( generateotp(),x);
		}
		
		Customer customer1=new Customer("amal","no:267,abewela","97127379v",29);
		System.out.println(customer1.getName());
		System.out.println(customer1.getAddress());
		System.out.println(customer1.getNic());
		System.out.println(customer1.getAge());
		
		Customer customer2=new Customer();
		customer2.setName("nimal deshapriya");
		System.out.println("new customer name is: "+customer2.getName());
		
	}
	
	
}