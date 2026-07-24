import java.util.Scanner;
import java.util.Arrays;
public class Prarray{
	
	public static void linearSearch(int [] arr1,int num){
		int size=arr1.length;
		int indexc=-1;
		try{

			for(int i=0;i<arr1.length;i++){
				if(arr1[i]==num){
					indexc=i;
					break;
				}
			
			}
			if(indexc!= -1){
				System.out.println("element found!");
			}else{
				System.out.println("element not founded");
			}
		}	
		catch (Exception e) { 
            System.out.println(e);
        }
	}

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
		
		
		//odd and even array
		int []array1={1,2,3,4,5};
	
		int evenC=0;
		int oddC=0;
		
		for(int i=0;i<array1.length;i++){
			if((array1[i]%2)==0){
				evenC++;
			}else{
				oddC++;
			}
		}
		int []oddArray=new int[oddC];
		int []evenArray=new int[evenC];
		int evenI=0;
		int oddI=0;
		for(int i=0;i<array1.length;i++){
			if((array1[i]%2)==0){
				evenArray[evenI]=array1[i];
				evenI++;
			}else{
				oddArray[oddI]=array1[i];
				oddI++;
			}
			
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray));
		
		
		
		// linear serach
		int [] arr1={1,2,3,4,5};
		System.out.print("Enter a element: ");
		int elemnetC=x.nextInt();
		linearSearch(arr1,elemnetC);
		
		
	}

}