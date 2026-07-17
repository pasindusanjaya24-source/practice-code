import java.util.Scanner;
public class ArraySecond{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int x;
		int [] array=new int[5];
		
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0;i<array.length;i++){
			System.out.print("Enter a ["+i+"] element: ");
			x=input.nextInt();
			array[i]=x;
			}
			for(int i=0;i<array.length;i++){
			if((array[i]%2)==0){
				evenCount++;
			}
			if((array[i]%2)!=0){
				oddCount++;
			}}
			
			int [] evenArray=new int[evenCount];
			int [] oddArray=new int[oddCount];
			int t=0;
			int u=0;
			
		for(int i=0;i<array.length;i++){
			if (array[i] % 2 == 0) {
                evenArray[t] = array[i];
			    t++;
			}
			else{
				oddArray[u]=array[i];
				u++;
			}
		}
		
		System.out.print("Even array: ");
		for(int i=0;i<evenArray.length;i++){
			if(evenArray[i]!=0){
				System.out.print(evenArray[i]);
			}
			
		}
		System.out.println();
		System.out.print("odd array: ");
		for(int i=0;i<oddArray.length;i++){
			if(oddArray[i]!=0){
				System.out.print(oddArray[i]);
			}
		}
		
	}
}