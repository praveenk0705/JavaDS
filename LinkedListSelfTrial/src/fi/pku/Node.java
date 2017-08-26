package fi.pku;

public class Node {

	int data;
	Node next;
	

	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
public String toString() {
		
		return "Data: " + this.data;
	}
}
