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
	 
	 public void appendData(char newData){
		Node newNode=new Node(newData);
		
		if(head== null){
			head=newNode;
			return;
		}
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=newNode;
		
		 
	 }
	 
	 public static void main(String []args){
		LinkList2 list1=new LinkList2();
		list1.head= new Node('A');
		Node second=new Node('B');
		Node third=new Node('C');
		
		list1.head.next=second;
		second.next=third;
        System.out.println("original nodeList:");

		list1.printList();
		System.out.println();
		
		list1.appendData('D');
		System.out.println("new nodeList:");
		list1.printList();

		
	 }
 }