public class MainLL{
	public static void main(String[]args){
		LinkedLists list=new LinkedLists();
		list.insertBegin('A');
		list.insertBegin('B');
		list.insertBegin('C');
		list.insertBegin('D');
		list.display();
		list.insertEnd('E');
		list.insertEnd('F');
		System.out.println();
		list.display();
		list.insertSpecific('B','G');
		list.insertSpecific('E','H');
		System.out.println();
		list.displayReverse();
		System.out.println();
		list.display();
		list.delete('D');
		System.out.println();
		list.display();
		list.delete('F');
		System.out.println();
		list.display();
		list.delete('A');
		System.out.println();
		list.display();
		System.out.println();
		list.displayReverse();
		System.out.println();
		System.out.println("count is "+list.count('E'));

	}
}