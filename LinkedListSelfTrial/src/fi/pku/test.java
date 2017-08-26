package fi.pku;

public class test {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtHead(10);
		list.addAtHead(43);
		list.addAtHead(15);
		list.addAtHead(150);
		System.out.println(list);
		System.out.println("head is " +list.head);
		list.reverseIt(list.head);
		System.out.println(list);


	}

}
