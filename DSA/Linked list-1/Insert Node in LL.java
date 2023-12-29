/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
        if (pos == 0){
			 Node t = new Node(data);
			 Node tem = head;
			 head = t;
			 head.next = tem;
			return head;
		}
		int x = 0;
		Node temp = head;
		while(temp!= null){
			if (x+1 == pos){
				Node t = new Node(data);
				Node tem = temp.next;
				temp.next = t;
				temp.next.next = tem;
				x++;
			}
			x++;
			temp = temp.next;
		}
		return head;		
	}
}