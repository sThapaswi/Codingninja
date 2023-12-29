/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (head == null || pos < 0) {
            return head;
        }

        if (pos == 0) {
            return head.next;
        }

        Node<Integer> current = head;
        int currentPos = 0;

        while (currentPos < pos - 1 && current.next != null) {
            current = current.next;
            currentPos++;
        }
        if (current.next == null) {
            return head;
        }

        current.next = current.next.next;

        return head;
    }
}
