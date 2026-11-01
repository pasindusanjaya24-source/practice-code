import java.util.Scanner;
public class BubbleSort{
	public static void bubbleSort(int []arr){
		int n=arr.length;
		int temp;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter ["+(i+1)+"] element:");
			arr[i]=input.nextInt();
		}
		bubbleSort(arr);
	
		
	}
}