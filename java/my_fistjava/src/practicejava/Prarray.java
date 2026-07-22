import java.util.Scanner;
public class Prarray{
	public static void main(String []args){
		Scanner x=new Scanner(System.in);
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		System.out.print("Enter a elemnet: ");
		int elemnet=x.nextInt();
		System.out.print("Enter a index: ");
		int index=x.nextInt();
		int newarr[]=new int[n+1];
		for(int i=0;i<=n;i++){
			if(i<index){
				newarr[i]=arr[i];
			}
			else if(i==index){
				newarr[i]=elemnet;
			}else{
				newarr[i]=arr[i-1];
			}
		} 
		System.out.println("Original array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("new array: ");
		for(int i=0;i<newarr.length;i++){
			System.out.print(newarr[i]+" ");
		}
		System.out.println();
		int rearr[]=new int[5];
		for(int i=0;i<n;i++){
			rearr[i]=arr[(n-1)-i];
		}
		for(int i=0;i<rearr.length;i++){
			System.out.print(rearr[i]+" ");
		}
		
	}

}