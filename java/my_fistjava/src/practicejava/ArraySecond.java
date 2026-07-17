import java.util.Scanner;
public class ArraySecond{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int x;
		int [] array=new int[5];
		int [] reArray=new int[5];
		
		for(int i=0;i<array.length;i++){
			System.out.print("Enter a ["+i+"] element: ");
			x=input.nextInt();
			array[i]=x;
			}
		for(int i=0;i<array.length;i++){
			reArray[i]=array[(array.length-1)-i]	;
		}
		System.out.print("Reversed Array: ");
		for(int i=0;i<array.length;i++){
			System.out.print(reArray[i]+" ");
		}
		
	}
}