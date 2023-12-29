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

    public static void printIthNode(Node<Integer> head, int i){
        int count = 0;
		Node<Integer> t = head;
		while(count!=i && t!=null){
			 t = t.next;
			  count++;
		  if(count==i && t!=null){
			 
			  System.out.print(t.data);
		  }
		}
    }
}