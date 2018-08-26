package dataStructures;
import dataStructures.Element;
public class LinkedList {
	private Element head;
	public LinkedList(Element element){
		this.head=element;
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
					
				}
				else {
					current=current.next;
				}
			}
		}
	}
}
