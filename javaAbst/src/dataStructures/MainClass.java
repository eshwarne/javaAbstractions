package dataStructures;
import java.util.Scanner;
import dataStructures.LinkedList;
import dataStructures.Element;
public class MainClass {
	public static void main(String[] args) {
		Element ele_1=new Element(10);
		Element ele_2=new Element(100);
		LinkedList a=new LinkedList();
		a.insert(ele_1); //this inserts at start
		a.insert(ele_2); //this inserts at start too
		System.out.println(a.head.next.value); //for testing the link
	}
	}
//	
//	public class Header{
//		Node head=new Node(1);
//		public void addNode(Node ele) {
//			Node current=head;
//			current.value=2;
//			current=getNode(current); //reassignment of a object instance changes the node but not the reference
//			current.value=5;
//		}
//		public Node getNode(Node ele) {
//			Node hi=new Node(3);
//			return hi;
//		}
//	}
//	public class Node{
//		public int value;
//		public Node next=null;
//		public Node(int val) {
//			this.value=val;
//		}
//	}
//	public static void main(String[] args) {
//		Scanner n=new Scanner(System.in);
//		System.out.println("Value?");
//		int val=n.nextInt();
//		System.out.println("Started");
//		MainClass x=new MainClass();
//		Header h=x.new Header();
//		Node newElement=x.new Node(val);
//		h.addNode(newElement);
//		System.out.println(h.head.value);
//		
//	}
//
//	
//}
