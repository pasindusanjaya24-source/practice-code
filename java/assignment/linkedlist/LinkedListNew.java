import java.util.Scanner;
public class LinkedListNew{
	Node head;
	
	public static class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			this.next=null;
		}
	}
	public void insertEnd(char e){
		Node newNode=new Node(e);
		if(head==null){
			head=newNode;
			return;
		}
		else{
			Node current=head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=newNode;
		}
	}
	
	void insertBegin(char e){
		Node newNode=new Node(e);
			newNode.next=head;
			head=newNode;
		
	}
	void insertSpecific(char e,char afe){
		Node newNode=new Node(afe);
		if(head==null){
			head=newNode;
			return;
		}else{
			Node current=head;
			while(current.next!=null){
				if(current.data==e){
					break;
				}
				current=current.next;
			}
			newNode.next=current.next;
			current.next=newNode;
			
		}
	}
	
	public void display(){
		if(head==null){
			System.out.println("list is empty!");
			return;
		}
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}System.out.println();
	}
	
	public void delete(char e){
		if(head.data==e){
			head=head.next;
			return;
		}
		Node current =head;
		while(current.next!=null){
			
			if(current.next.data==e ){
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
	}
	
	public static void main(String[]args){
		LinkedListNew list=new LinkedListNew();
		Scanner input=new Scanner(System.in);
		list.display();
		list.insertBegin('a');
		list.insertBegin('b');
		list.insertEnd('s');
		list.insertEnd('k');
		list.display();
		list.insertSpecific('s','m');
		list.display();
		list.insertSpecific('m','x');
		list.display();
		list.delete('b');
		list.display();
		list.delete('k');
		list.display();
		
	}
}