import java.util.Scanner;
public class Palindrame{
	static int top=-1;
	
	public static void push(char e,int size,char[]s){
		if(isFull(s,size)){
			System.out.println("stack is full!");
			return;
		}
		top++;
		s[top]=e;
	}
	
	public static char pop(char[]s){
		if(isEmpty(s)){
			return '\0';
		}
		char popValue=s[top];
		top--;
		return popValue;
	}
	public static boolean isEmpty(char[]s){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isFull(char[]s,int size){
		if(top==size-1){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("enter a word for check palindrame: ");
		String word=input.nextLine();
		
		int size=word.length();
		char []stack=new char[size];
		for(int i=0;i<size;i++){
			push(word.charAt(i),size,stack);
		}
		String reword="";
		while(!isEmpty(stack)){
			reword+=pop(stack);
		}
		if(word.equalsIgnoreCase(reword)){
			System.out.println("that is palindrame");
		}else{
			System.out.println("that is not the palindrame!");
		}
	
		
		
		
	}
}	