public  class LinkedLists{
	Node head;
	Node tail;
	public  void insertBegin(char data){
		Node newNode=new Node(data);                //insert in beginning
		if(head==null){
			head=newNode;
			tail=newNode;
		}else{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
		
	}
	
	public void display(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public void insertEnd(char data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			tail=newNode;
			return;
		}
		
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
	}
	public void insertSpecific(char e,char afE){
		Node newNode=new Node(afE);
		Node current=head;
		while(current!=null){
			if(current.data==e){
				break;
			}
			current=current.next;
		}
		if(current==null){
			System.out.println("element is not found!");
			return;
		}
		
		newNode.next=current.next;
		current.next.prev=newNode;
		current.next=newNode;
		newNode.prev=current;
	}
	
	public void delete(int e){
		Node current=head;
		if(head==null){
			System.out.print("list empty!");
			return;
		}
		if(e==head.data){
			head=head.next;
			head.prev=null;
			return;
		}
		
		if(e==tail.data){
			tail=tail.prev;
			tail.next=null;
			return;
		}
		
		while(current!=null){
			if(current.data==e){
				current.prev.next=current.next;
				current.next.prev=current.prev;
				return;
			}
			current=current.next;
		}
	}
	
	public void displayReverse(){
		Node current=tail;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.prev;
		}
	}
	
	public int count(char e){
		int count=0;
		Node current=head;
		while(current!=null){
			count++;
			if (current.next.data==e){
				return count;
			}
			current=current.next;
		}
		return -1;
		
	}
}