public class ShoppingCartStack{
	static int top=-1;
	public static void addItem(String []s,int size,String e){
		if(top==size-1){
			System.out.println("stack is full!");
			return;
		}
		top++;
		s[top]=e;
		System.out.println("push operation succesfully exeuted");
	}
	
	public static String removeItem(String[]s){
		if(isEmpty(s)){
			return "stack is empty";
		}
		String ss=s[top];
		top--;
		return ss;
	}
	public static boolean isEmpty(String []s){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	public static void viewTopItem(String []s){
		if(isEmpty(s)){
			System.out.println("stack is empty!");
			return;
		}else{
			System.out.println(s[top]);
		}
	}
	public static void displayItem(String []s){
		for(int i=0;i<=top;i++){
			System.out.print(s[i]+" ");
		}System.out.println();
	}
	
	public static void viewCartInReverse(String []s){
		for(int i=top;i>=0;i--){
			System.out.print(s[i]+" ");
		}System.out.println();
	} 
	
	public static void main(String []args){
		int size =10;
		String[] stack=new String[size];
		addItem(stack,size,"dhal");
		addItem(stack,size,"fish");
		addItem(stack,size,"sugar");
		viewTopItem(stack);
		displayItem(stack);
		viewCartInReverse(stack);
		System.out.println();
		System.out.println("remove element is : "+removeItem(stack));
		
	}
}