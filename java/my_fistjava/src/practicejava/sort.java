public class sort {
	//bubble Sorting
	public static void bubbleSort(int[]arr){
		int temp=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	//selection sorting
	public static void selection(int []arr){
		int size=arr.length;
		for(int i=0;i<size;i++){
			int min_index=i;
			for(int j=i+1;j<size;j++){
				if(arr[min_index]>arr[j]){  //inner loop use for find the min index in unsorted array 
					min_index=j;
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String []args){
		int []arr={5,1,12,-5,16};
		System.out.println("Before the sorting: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		//bubbleSort(arr);
		selection(arr);         
		System.out.println("\nAfter the sorting: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}