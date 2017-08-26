import java.io.DataInputStream;
import java.io.IOException;


public class LL {

public static void main(String[] args) {
    // TODO Auto-generated method stub      
    Node root = null;

    DataInputStream reader = new DataInputStream(System.in);        
    int op = 0;
    while(op != 6){

        try {
            System.out.println("Enter Option:\n1:Insert Front 2:Delete Front 3:Insert Rear 4:Delete Rear 5:Display List 6:Exit");
            //op = reader.nextInt();
            op = Integer.parseInt(reader.readLine());
            switch (op) {
            case 1:
                System.out.println("Enter Value: ");
                int val = Integer.parseInt(reader.readLine());
                root = insertNodeFront(val,root);
                display(root);
                break;
            case 2:
                root=removeNodeFront(root);
                display(root);
                break;
            case 3:
                System.out.println("Enter Value: ");
                val = Integer.parseInt(reader.readLine());
                root = insertNodeRear(val,root);
                display(root);
                break;
            case 4:
                root=removeNodeRear(root);
                display(root);
                break;
            case 5:
                display(root);
                break;
            default:
                System.out.println("Invalid Option");
                break;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    System.out.println("Exited!!!");
    try {
        reader.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }       
}

static Node insertNodeFront(int value, Node root){  
    Node temp = new Node(value);
    if(root==null){
        return temp; // as root or first
    }
    else
    {
        temp.next = root;
        return temp;
    }               
}

static Node removeNodeFront(Node root){
    if(root==null){
        System.out.println("List is Empty");
        return null;
    }
    if(root.next==null){
        return null; // remove root itself
    }
    else
    {
        root=root.next;// make next node as root
        return root;
    }               
}

static Node insertNodeRear(int value, Node root){   
    Node temp = new Node(value);
    Node cur = root;
    if(root==null){
        return temp; // as root or first
    }
    else
    {
        while(cur.next!=null)
        {
            cur = cur.next;
        }
        cur.next = temp;
        return root;
    }               
}

static Node removeNodeRear(Node root){
    if(root==null){
        System.out.println("List is Empty");
        return null;
    }
    Node cur = root;
    Node prev = null;
    if(root.next==null){
        return null; // remove root itself
    }
    else
    {
        while(cur.next!=null)
        {
            prev = cur;
            cur = cur.next;
        }
        prev.next=null;// remove last node
        return root;
    }               
}

static void display(Node root){
    System.out.println("Current List:");
    if(root==null){
        System.out.println("List is Empty");
        return;
    }
    while (root!=null){
        System.out.print(root.val+"->");
        root=root.next;
    }
    System.out.println();
}

static class Node{
    int val;
    Node next;
    public Node(int value) {
        // TODO Auto-generated constructor stub
        val = value;
        next = null;
    }
}
}