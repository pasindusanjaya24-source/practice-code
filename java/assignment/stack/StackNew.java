import java.util.Scanner;
public class StackNew{
	static int top=-1;
	
	public static void push(char e,char []s,int size){
		if(isFull(size)){
			return;
		}
		top++;
		s[top]=e;
		System.out.println("pushed succefully!");
	}
	
	public static void pop(char []s){
		if(isEmpty()){
			return;
		}
		char pop_value=s[top];
		top--;
		System.out.println("pop succefully!");
		
	}
	public static void display(char []s){
		for(int i=0;i<=top;i++){
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	public static void peek(char []s){
		if(top==-1){
			System.out.println("stack is empty!");
			return;
		}else{
			System.out.println("top is : "+s[top]);
		}
	}
	
	public static boolean isFull(int size){
		if(top==size-1){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int size=10;
		char []stack=new char[size];
		push('a',stack,size);
		push('b',stack,size);
		push('v',stack,size);
		push('k',stack,size);
		display(stack);
		peek(stack);
		pop(stack);
		display(stack);
		peek(stack);
		
	}
}