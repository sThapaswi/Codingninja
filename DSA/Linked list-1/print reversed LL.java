import java.util.ArrayList;

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

import java.util.ArrayList;

public class Solution {

    public static void printReverse(Node<Integer> root) {
        Node<Integer> t = root;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while (t != null) {
            arr.add(t.data);
            t = t.next;
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
