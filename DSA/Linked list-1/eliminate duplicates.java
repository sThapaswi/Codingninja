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

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		if(head ==null){
			return head;
		}
		if(head.next == null){
			return head;
		}
	    Node temp = head;
		Node temp2 = head.next;
		while(temp2 != null){
			if(temp.data.equals(temp2.data)){
				temp2 = temp2.next;
			}
			else{
				temp.next = temp2;
				temp = temp2;
			}
		}
		temp.next = null;
		return head;
	}

}