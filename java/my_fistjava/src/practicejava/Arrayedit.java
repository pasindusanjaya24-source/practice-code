package practicejava;
import java.util.Scanner;
public class Arrayedit{
	public static void main(String [] args){
		//get input in to arry
		Scanner x=new Scanner(System.in);
		int input;
		int [][]array_2= {{1,2},{3,4}};
		int [][]sumarray=new int[2][2];
		int [][]array_1=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("enter element: ");
				input =x.nextInt();
				array_1[i][j]=input;
			}
		}
		//array printing
		int max=array_1[0][0];
		System.out.println("array 1 print: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(array_1[i][j]+" ");
				if(array_1[i][j]>max) {
					max=array_1[i][j];
				}
				sumarray[i][j]=array_1[i][j]+array_2[i][j];
			}
			System.out.println();
		}
		System.out.println("max elemnt value is:"+max);
		//sumarray print
		System.out.println("sumarray print: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(sumarray[i][j]+" ");
			}
			System.out.println();
		}
		x.close();
	}
}
