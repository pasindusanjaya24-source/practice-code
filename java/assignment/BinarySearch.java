import java.util.Scanner;
public class BinarySearch{
	public static int binarySearch(int[]arr,int target){
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left<=right){
			mid=left+(right-left)/2;
			if(target==arr[mid]){
				return mid;
			}
			else if(target>arr[mid]){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter ["+(i+1)+"] element: ");
			arr[i]=input.nextInt();
		}
		System.out.print("Enter a target element: ");
		int target=input.nextInt();
		int result=binarySearch(arr,target);
		if(result==-1){
			System.out.println("Element not found!");
			
		}else{
			System.out.println("element found.index is "+result);
		}
	}
}