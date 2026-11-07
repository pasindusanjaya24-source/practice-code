import java.util.Scanner;
public class Binary {
	
	public static int  binarySearch(int[]arr,int t){
		int n=arr.length;
		int left=0;
		int right=n-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(arr[mid]==t){
				return mid;
			}else if(arr[mid]<t){
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
			System.out.println("enter element: ");
			arr[i]=input.nextInt();
		}
		System.out.println("eneter a target element: ");
		int target=input.nextInt();
		int result=binarySearch(arr,target);
		if(result== -1){
			System.out.println("Element noy found!");
			
		}else{
			System.out.println("element is found!");
		}
		
	}
}