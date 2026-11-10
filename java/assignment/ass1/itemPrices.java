import java.util.Scanner;
public class itemPrices{
	
	public static void insertBeginning(int e,int[]arr,int c){
		for(int i=c;i>0;i--){
			arr[i]=arr[i-1];
		}arr[0]=e;
		
	}
	
	public static void display(int[]arr,int current_size){
		for(int i=0;i<current_size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void insertSpecific(int[]arr,int current_size,int e,int index){
		for(int i=current_size;i>index;i--){
			arr[i]=arr[i-1];
		}arr[index]=e;
	}
	public static void reverseArray(int []arr,int current_size){
		for(int i=current_size-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int sum(int[]arr,int current_size){
		int sum=0;
		for(int i=0;i<current_size;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static int binarySearch(int[]arr,int current_size,int el){
		
		for(int i=0;i<current_size;i++){
			for(int j=1;j<(current_size-i);j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		int l=0;
		int r=current_size-1;
		while(l<=r){
			int mid=l+(r-l)/2;
			if(arr[mid]==el){
				return mid;
			}else if(arr[mid]<el){
				l=mid+1;
			}else{
				r=mid-1;
			}
			
		}
		return -1;
		
	}
	
	public  static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int []shopItem=new int[15];
		int current_size=10;
		for(int i=0;i<current_size;i++){
			System.out.println("enter a element: ");
			shopItem[i]=input.nextInt();
		}
		System.out.println("enter a element for beginning: ");
		int begin=input.nextInt();
		insertBeginning(begin,shopItem,current_size);
		current_size++;
		System.out.println();
		display(shopItem,current_size);
		System.out.println();
		System.out.print("enter a value for insert : ");
		int Nelement=input.nextInt();
		System.out.print("enter a index for insert : ");
		int Nindex=input.nextInt();
		
		insertSpecific(shopItem,current_size,Nelement,Nindex);
		current_size++;
		System.out.println("Input Order:");
		display(shopItem,current_size);
		System.out.println();
		System.out.println("reverse array: ");
		reverseArray(shopItem,current_size);
		System.out.println();
		System.out.println("sum of array: "+sum(shopItem,current_size));
		System.out.println();
		System.out.println("enter  a value for searching: ");
		int SEelement=input.nextInt();
		int result=binarySearch(shopItem,current_size,SEelement);
		if(result==-1){
			System.out.println("element not found!");
			
		}else{
			System.out.print("element found.");
		}
	
	
	}
	
}