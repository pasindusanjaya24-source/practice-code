import java.util.Scanner;
public class Arrayss{
	public static int sumArray(int []arr){
		int sum=0;                             //calculate the sum of array
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	public static double averageArray(int[]arr,int sumA){     
		int n=arr.length;                      //calculate the average of the array
		double avg=sumA/n;                
		return avg;
	}
	public static int linearSearch(int[]arr,int t){
		int n=arr.length;                    //find the specific element
		int index=-1;
		for (int i=0;i<n;i++){
			if(arr[i]==t){
				index=i;
				break;
			}
		}
		return index;
	}
	
	public static void copyArray(int[]arr,int []array1){   //coping array from array to another new array
		for(int i=0;i<arr.length;i++){
			array1[i]=arr[i];
		}
	}
	
	public static int largeElement(int[]arr){  //large number searching in array
		int large=arr[0];
		for(int i=1;i<arr.length;i++){
			if(large<=arr[i]){
				large=arr[i];
			}
		}
		return large;
	}
	
	public static int smallestElement(int[]arr){  //smallest number searching in array
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<=smallest){
				smallest=arr[i];
			}
		}
		return smallest;
	}
	public static int dif(int max,int min){ //differences between largest and smallest
		return max-min;
	}
	
	public static void reversedArray(int[]arr,int[]reArray){
		int n=arr.length;                
		for(int i=0;i<n;i++){           //reverse a Array
			reArray[i]=arr[n-1-i];
		}
	}
	public static void duplicateArray(int[]arr){
		int n=arr.length;
		int l=0;
		int count=0;
		while(l<(n-1)){
			for(int i=l+1;i<n;i++){
				if(arr[i]==arr[l]){
					count++;
					System.out.print(arr[l]+",");
				}
			}
			l+=1;
		}
		System.out.println("duplicate count is: "+count);
	}
	
	public static void evenOdd(int[]arr){   //select even and odd numbers 
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				evenCount++;
			}else{
				oddCount++;
			}
		}
		int []arrE=new int[evenCount];
		int []arrO=new int[oddCount];
		int evenIndex=0;
		int oddIndex=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arrE[evenIndex]=arr[i];
				evenIndex++;
			}else{
				arrO[oddIndex]=arr[i];
				oddIndex++;
			}
		}
		System.out.print("even array: ");
		for(int i=0;i<evenCount;i++){
			System.out.print("["+arrE[i]+"] " );
		}
		System.out.println();
		System.out.print("odd array: ");
		for(int i=0;i<oddCount;i++){
			System.out.print("["+arrO[i]+"] " );
		}
	}
	public static int[] insertionSort(int[]arr){  //assending sort
		int n=arr.length;
		for(int i=0;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		return arr;
	}
	public static int[] decInsertionSort(int[]arr){  //deceding sort
		int n=arr.length;
		for(int i=0;i<n;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key>arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	public static void lastOne(int []a,int []d){
		int n1=a.length;
		int n2=d.length;
		int newN=n1+n2;
		int []lastArray=new int[newN];
		int ll=0;
		for(int i=0;i<n1;i++){
			lastArray[ll]=d[i];
			ll++;
			lastArray[ll]=a[i];
			ll++;
		}
		
		for(int i=0;i<newN;i++){
			System.out.print(lastArray[i]+" ");
		}
	}

	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int size=5;
		int []arr=new int[size];
		for (int i=0;i<size;i++){
			System.out.print("enter ["+(i+1)+"] element: ");
			arr[i]=input.nextInt();
		}
		System.out.println();
		for (int i=0;i<size;i++){
			System.out.print("["+arr[i]+"] ");
		}
		System.out.println();
		System.out.print("array: ");
		int sumA=sumArray(arr);
		System.out.println("sum of array:"+sumA);
		
		System.out.println("average of array:"+averageArray(arr,sumA));
		
		System.out.print("enter a elemet waht do you want to find: ");
		int target=input.nextInt();
		int result=linearSearch(arr,target);
		if(result== -1){
			System.out.println("element is not in the array!");
		}else{
			System.out.println("element is found.it is in "+(result)+" index and it is "+(result+1)+" element");
		}
		
		int []array1=new int[5];
		copyArray(arr,array1);
		System.out.println("after coping new array,");
		for (int i=0;i<size;i++){
			System.out.print("["+array1[i]+"] ");
		}
		System.out.println();
		int largeE=largeElement(arr);
		System.out.println("large element is: "+largeE);
		int smallestE=smallestElement(arr);
		System.out.println("smallest element is: "+smallestE);
		System.out.println("differences between large and smallest: "+dif(largeE,smallestE));
		
		int []rearray=new int[5];
		reversedArray(arr,rearray);
		System.out.print("revesed array:");
		for(int i=0;i<rearray.length;i++){
			System.out.print("["+rearray[i]+" ]");
		}
		System.out.println();
		duplicateArray(arr);
		System.out.println();
		evenOdd(arr);
		
		int[] assArray=insertionSort(arr);
		System.out.println();
		System.out.print("assecending: ");
		for (int i=0;i<size;i++){
			System.out.print("["+assArray[i]+"] ");
		}
		
		int []desArraay=decInsertionSort(array1);
		System.out.println();
		System.out.println("decending: ");
		
		for (int i=0;i<size;i++){
			System.out.print("["+desArraay[i]+"] ");
		}
		System.out.println();
		lastOne(assArray,desArraay);
		
	
	}
	
}