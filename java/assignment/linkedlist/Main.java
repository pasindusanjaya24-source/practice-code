import java.util.Scanner;
public class Main{	
	Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void insert(int data){
		Node newNode=new Node(data);
		
		if(head==null){
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null){
			current=current.next;
		}
		current.next=newNode;
		
	}
	
	public void delete(int t){
		if(head==null){
			System.out.println("list is empty!");
			return;
		}
		if(head.data==t){
			head=head.next;
			return;
		}
		
		Node current=head;
		while(current.next!=null){
			if(current.next.data==t){
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
	}
	
	public void search(int t){
		Node current=head;
		while(current!=null){
			if(current.data==t){
				System.out.println("Element found!");
				return;
			}
			current=current.next;
		}
		System.out.println("element is not founded !");
		
	}
	
	public boolean isPlindrame(String m){
		
		
	}
	
	public void dispaly(){
		Node current=head;
		while(current!=null){
			System.out.print(current.data+" ");
			current=current.next;
		}System.out.println();
	}
	
	public static void main(String[]args){
		boolean gate=true;
		Main list=new Main();
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("\t ==== Linked List Menu ===");
			System.out.println("\t 01.insert");
			System.out.println("\t 02.delete");
			System.out.println("\t 03.search");
			System.out.println("\t 04.display");
			System.out.println("\t 05.isPalindrome");
			System.out.print("enter your option: ");
			int choice=input.nextInt();
			System.out.println();
		
			switch(choice){
				case 1:
					System.out.println("enter element you want to insert:");
					int element=input.nextInt();
					list.insert(element);
					break;
				case 2:
				    System.out.println("enter element you want to delete:");
					int Delement=input.nextInt();
				    list.delete(Delement);
					break;
				case 3:
					System.out.println("enter element you want to search:");
					int Selement=input.nextInt();
				    list.search(Selement);
					break;	
				case 4:
				    list.dispaly();
					break;
				
				default:
					System.out.println("invaild input !");
					gate=false;
					
			}
			
		}while(gate);
		
	}
}