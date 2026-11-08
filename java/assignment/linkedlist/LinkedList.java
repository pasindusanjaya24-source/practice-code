public class LinkedList{
	Node head;
	static class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			this.next=null;
		}
	}
	public void print(){
		Node current=head;
		while(current.next!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[]args){
		LinkedList list= new LinkedList();
		list.head=new Node('A');
		Node second=new Node('B');
		Node third=new Node('C');
		Node fouth=new Node('D');
		
		list.head.next=second;
		second.next=third;
		third.next=fouth;
		
		list.print();
		
		
	}
}