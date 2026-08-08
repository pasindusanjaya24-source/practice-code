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
	//insertion sorting
	public static void insertion(int []arr){
		int le=arr.length;
		for(int i=1;i<le;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j-=1;
			}
			arr[j+1]=key;
		}
	}
	
	//quick sorting 
	public static void quickSort(int []a,int lb,int ub){
		if(lb<ub){
			int local=partition(a,lb,ub);
			quickSort(a,lb,local-1);
			quickSort(a,local+1,ub);
			
			
		}
	}
	public static int partition(int[]a,int lb,int ub){
		int pivot=a[lb];
		int  start=lb;
		int  end=ub;
		 while(start<end){
			 while(start<ub && a[start]<=pivot){
				 start++;	 
			 }
			 while(a[end]>pivot){
				 end--;
			 }
			  
			 if(start<end){
				 int temp=a[start];
				 a[start]=a[end];
				 a[end]=temp;
			 }
		 }
		 int temp=a[lb];
		 a[lb]=a[end];
		 a[end]=temp;
		 
		 
		 return end;
		 
	}
	
	
	public static void main(String []args){
		int []arr={5,1,12,-5,16};
		System.out.println("Before the sorting: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int []arr1={5,10,2,-5,16};
		bubbleSort(arr1);
		System.out.println("\nAfter the Bubble sorting: ");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		int []arr2={52,21,12,-5,6};
		selection(arr2);
		System.out.println("\nAfter the selection sorting: ");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		int []arr3={5,12,2,-15,6};
		insertion(arr3);         
		System.out.println("\nAfter the  insertion sorting: ");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
		int []arr4={7,6,10,5,9,2,1,15,6};
		quickSort(arr4,0,arr4.length-1);
		System.out.println("\nAfter the  Quick sorting: ");
		for(int i=0;i<arr4.length;i++){
			System.out.print(arr4[i]+" ");
		}
		
	}
}