class LinkList{
	Node head;
	
	static class Node{
		char data;
		Node next;
		
		Node(char d){
			data=d;
			next=null;
		}
		
		public void printList(){
			Node current=ead;
			while(current != null){
				system.out.print(current.data+" ");
				current=current.next;
			}
		}
	}
	
	public static void main(String []args){
		LinkList list1=new LinkList();
		list1.head=new Node('A');
		Node second=new Node('B');
		Node third=new Node('C');
		
		list1.head.next=second;
		second.next=third;
		list1.printList();
	} 
}