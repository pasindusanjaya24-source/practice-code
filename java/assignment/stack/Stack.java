import java.util.Scanner;
public class Stack{
	static int top=-1;
	
	
	public static void push(char []s,char e,int size){
		if(isFull(s,size)){
			System.out.println("stack is full!");
			return;
		}
		top++;
		s[top]=e;
		System.out.println("succesfully pushed!");
	}
	public static void pop(char[]s){
		if(isEmpty(s)){
			System.out.println("stack is empty!");
			return;
		}
		System.out.println("pop value: "+s[top]);
		top--;
		
	}
	public static char peek(char[]s){
		if(top== -1){
			return '\0';
		}else{
			return s[top];
		}
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
	
	public static void display(char[]s,int top){
		for(int i=0;i<=top;i++){
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[]args){
		
		int size=10;
		char [] stack=new char[size];
		Scanner input=new Scanner(System.in);
		boolean gate=true;
		do{
			System.out.println("Stack Operations");
			System.out.println("1.push:");
			System.out.println("2.pop:");
			System.out.println("3.peek:");
			System.out.println("4.isempty:");
			System.out.println("5.isfull:");
			System.out.println("6.display:");
			System.out.println();
			System.out.println("Enter a Element: ");
			int ele=input.nextInt();
			
			switch(ele){
				case 1:
					System.out.println("enter a element for push: ");
					char ch=input.next().charAt(0);
					push(stack,ch,size);
					break;
				case 2:
					pop(stack);
					break;
				case 3:
					System.out.println("top value is "+peek(stack));
					break;
				case 4:
					System.out.println("stack is empty:"+isEmpty(stack));
					break;
				case 5:
					System.out.println("stack is full:"+isFull(stack,size));
					break;
				case 6:
					display(stack,top);
					break;
					
				default:
					gate=false;
			}
		}while(gate);
			
		
		
	}
}	