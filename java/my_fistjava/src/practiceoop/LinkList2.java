 class LinkList2{
	 Node head;
	 static class Node{
		 char data;
		 Node next;
		 Node(char d){
			 data=d;
			 next=null;
		 }
	 }
	 
	 public void printList(){
		 Node current=head;
		 while(current!=null){
			 System.out.print(current.data+" ");
			 current=current.next;
		 }
	 }
	 
	 public static void main(String []args){
		Node list1=new Node();
		list1.head= new Node('A');
		Node second=new Node('B');
		Node third=new Node('c');
		
		list1.head.next=second;
		second.next=third;
		
		list1.printList();
		
	 }
 }