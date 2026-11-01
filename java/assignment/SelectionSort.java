public class SelectionSort{
	public static void selecttonSort(int[]arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
				int minindex=i;
				for(int j=i+1;j<n;j++){
					if(arr[j]<arr[minindex]){
						minindex=j;
					}
				}
				int temp=arr[minindex];
				arr[minindex]=arr[i];
				arr[i]=temp;
		}
		
	}
	public static void main(String[]args){
		int []arr={12,45,2,7,1,21};
		System.out.print("Original Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print("[ "+arr[i]+" ]  ");
		}
		System.out.println();
		System.out.println();
		System.out.print("Sorted Array:");
		
		selecttonSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print("[ "+arr[i]+" ]  ");
		}
		
	}
}