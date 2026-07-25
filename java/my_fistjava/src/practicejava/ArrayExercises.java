import java.util.Scanner;
public class ArrayExercises{
	public static int binarySearch(int []arr,int t){
		int left=0;
		int right=arr.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(arr[mid]==t){
				return mid;
			}
			if(arr[mid]<t){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return -1;
		
	}
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		/*int []number={1,2,3,4,5};
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
		}*/
		
		int [] arr={1,2,3,4,5};
		System.out.print("Enter a element for apply binary search: ");
		int t=input.nextInt();
		int r=binarySearch(arr,t);
		if(r != -1){
			System.out.println("element founded!");
		}else{
			System.out.println("Element not founded!");
			
		}
		input.close();
	}
}