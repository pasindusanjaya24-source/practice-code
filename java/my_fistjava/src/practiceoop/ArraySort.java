
public class ArraySort{
	
	public static void bubleSort(int []arr){
		int n=arr.length;  
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			int minIndex=i;
			for(int j=(i+1);j<n;j++){
				if (arr[minIndex]>arr[j]){
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void insertionSort(int[]arr){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}
	
	public static void main(String[]args){
		int []arr1={8,47,45,2,1};
		bubleSort(arr1);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		
		int []arr2={4,47,5,2,11};
		selectionSort(arr2);
		System.out.println();
		System.out.println("selection sort");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		int []arr22={4,7,5,2,1};
		insertionSort(arr22);
		System.out.println();
		System.out.println("insertion sort");
		for(int i=0;i<arr22.length;i++){
			System.out.print(arr22[i]+" ");
		}
		
	}
}