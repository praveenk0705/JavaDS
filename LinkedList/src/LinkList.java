
public class LinkList {

	private Node head;
	
	public void insertAtHead (int data){
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode; 
	}
	public void printList(){
		Node current = this.head;
		while(current != null){
			current.printNode();
			current = current.getNextNode();
		}
	}
	
	/*@Override
	public String toString(){
		String result = "{";
		Node current = this.head;
		
		while(current !=null){
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}*/
}
