package practicejava;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class new_one {
	public static void main(String []args) {
		Scanner x=new Scanner(System.in);
		System.out.print("enter name : ");
		String name=x.nextLine();
		System.out.print("Enter address: ");
		String address=x.nextLine();

		int []array1=new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("enter "+(i+1)+" subject: " );
			int index=x.nextInt();
			array1[i]=index;
		}
		System.out.println(Arrays.toString(array1));
			
		
		System.out.println("1.Show details");
		System.out.println("2.Show All marks");
		System.out.println("3.Show Total Marks");
		System.out.println("4.Show details");
		System.out.print("\nEnter your option: ");
		int option=x.nextInt();
		
		Student y=new Student(name,address);
		switch(option) {
		case 1:
			y.showDetails();
			break;
		case 2:
			y.printArray1(array1);
			break;
		case 3:
			int s=y.printTotal(array1);
			System.out.println("total mark is: "+s);
			break;
		case 4:
			double v=y.printAverage(y.printTotal(array1));
			System.out.println("average is: "+v);
			break;
		default:
			System.out.print("invalid input!");
		}

		x.close();
	}
	}
	
class Student{
	String name,address;
	int []array1;
	
	public Student(String sname,String saddress){
		name=sname;
		address=saddress;
	}
	
	public void showDetails() {
		System.out.println("--------------Student Management System-----------");
		System.out.println("your name is"+name);
		System.out.println("your adress is"+address);
	}
	
	public void printArray1(int []array1) {
		System.out.print("All marks are: [");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}System.out.print("]");
	}
	
	public int printTotal(int []array1) {
		int total=0;
		for(int i=0;i<array1.length;i++) {
			total+=array1[i];
		}
		return total;
	}
	
	public double printAverage(int s){
		return s/5.0;
	}
	
}
 

