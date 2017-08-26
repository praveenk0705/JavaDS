package fi.pku;

public class LinkedList {
	Node head;
	

	@Override
	public String toString(){
		String result = "{";
		Node current = this.head;
		
		while(current !=null){
			result += current.toString() + ",";
			current = current.getNext();
		}
		result += "}";
		return result;
	}
	public void addAtHead(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
		
	}
	public void reverseIt( Node head){
		if (head == null){
			return;
		}
		reverseIt(head.next);
		System.out.println(head.data);
	}

}
