class Linked{
	Node head;
	static class Node{ 
		char data;
		Node next;
		
		Node(char d){
			data=d;
			next=null;
		}
	}
	public void printLi(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public void appendLi(char newData){
		Node data1=new Node(newData);
		
		if(head ==null){
			head=data1;
			return;
		}
		
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=data1;
		
	}
	
	public static void main(String[]args){
		Linked list22=new Linked();
		list22.head=new Node('A');
		
		Node second=new Node('B');
		Node third=new Node('C');
		
		list22.head.next=second;
		second.next=third;
		System.out.println("original :");
		list22.printLi();
		list22.appendLi('F');
		System.out.println();

		System.out.println("new :");
		list22.printLi();
		

	}
}