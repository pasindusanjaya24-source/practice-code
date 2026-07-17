import java.util.Scanner;
public class ArrayExercises{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		int []number={1,2,3,4,5};
		System.out.print("enter insert element: ");
		int element=input.nextInt();
		System.out.print("enter  index for insert element: ");
		int targetIndex=input.nextInt();
		
		int []newArray=new int [(number.length)+1];
		
		for(int i=0;i<=number.length;i++){
			if(i<targetIndex){
				newArray[i]=number[i];
			}else if(i==targetIndex){
				newArray[i]=element;
			}else{
				newArray[i]=number[i-1];
			}
			
		}
		System.out.print("original  array: ");
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]+" ");
		}
		System.out.println();
		System.out.print("New  array: ");
		for(int i=0;i<newArray.length;i++){
			System.out.print(newArray[i]+" ");
		}
		
		
		
	}
}