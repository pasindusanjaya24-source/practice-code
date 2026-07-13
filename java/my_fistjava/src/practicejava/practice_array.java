import java.util.Scanner;
public class practice_array{
	public static void main(String[]args){
		Scanner x=new Scanner(System.in);
		int input;
		int[] arr=new int[6];
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter a "+(i+1)+"element :");
			input=x.nextInt();
			arr[i]=input;
			
		}
		int max=arr[0];
		int maxindex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				maxindex=i;
				
			}
			
		}
		System.out.println("max value is "+max+". inedx is "+maxindex);
		
		
		int size=arr.length;
		int support=arr[0];
		arr[0]=arr[size-1];
		arr[size-1]=support;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			}
			
			//2 Question 
			int indexs=-1;
			int marki;
			int acmark;
		String [] students={"amal","lahiru","supun","vidusha","mithun"};
		int [] marks={45,90,89,70,60};
		System.out.print("Enter Name for search: ");
		String name=x.nextLine();
		for (int i=0;i<5;i++){
			if(name.equals(students[i])){
				indexs=i;
				marki=marks[i];
				acmark=marki/10;
				switch(acmark){
					case 10:
					case 9:
					case 8:
						System.out.println("A");
						break;
					case 7:
						if(marki>=75){
							System.out.println("A");
						}else{
							System.out.println("B");
						}
						break;
					case 6:
					if(marki>=65){
							System.out.println("B");
						}else{
							System.out.println("C");
						}
						
						break;
					case 5:
						System.out.println("C");
						break;
					default:
						System.out.println("Fail");
					
					
					
					
				}
				
				
			}
			
		}if(indexs==-1){
		System.out.println("invaild member");}
		
		//Question 03: 2D Array Matrix Diagonal Sum
		
		int sum=0;
		int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(i==j){
					sum+=matrix[i][j];
					
				}
				
			}
			
		
		}
		System.out.println("sum : "+sum);
		

	}
}