public class Selection{
	
	public static void selectionSort(int[]arr){
		int n=arr.length;
		int minIndex,temp;
		for(int i=0;i<n;i++){
			minIndex=i;
			for(int j=i+1;j<n;j++){
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
			}
			temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[]args){
		int []arr={4,2,5,4,1,3,14,6};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}