package dataStructures;
import dataStructures.Element;
public class LinkedList {
	public Element head;
	public LinkedList(Element element){
		this.head=element;
	}
	public LinkedList() {
		this.head=null;
	}
	public void insert(Element ele) {
		ele.next=this.head;
		this.head=ele;
		
	}
	public void getPos(int pos) {
		
	}
	public void insert(int pos,Element ele) {
		int i=0;
		Element current=this.head;
		if (pos==i) {
			this.head=ele;
			ele.next=current;
			return;
		}
		else {
			for(i=0;i<pos;i++){
				if(i==pos-1) {
					Element prev=current;
					if(current.next!=null) {
						ele.next=current;
						prev.next=ele;
					}
				}
				else {
					current=current.next;
				}
			}
		}
	}
	
}
