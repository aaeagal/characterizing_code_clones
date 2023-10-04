
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RotateLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 0;
        ListNode current = head;
        
        while (current != null) {
            length++;
            current = current.next;
        }
        
        k = k % length;
        if (k == 0) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        
        return newHead;
    }

    public static void main(String[] args) {
        // Create the linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        // Rotate the linked list
        RotateLinkedList rotateLinkedList = new RotateLinkedList();
        ListNode newHead = rotateLinkedList.rotateRight(head, 2);
        
        // Print the rotated linked list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}



class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode tail = head;
        int length = 1;
        
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        k = k % length;
        
        if (k == 0) {
            return head;
        }
        
        ListNode curr = head;
        for (int i = 1; i < length - k; i++) {
            curr = curr.next;
        }
        
        tail.next = head;
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}



class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        
        k = k % length;
        if (k == 0) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        for (int i = 0; i <= k; i++) {
            fast = fast.next;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;
        dummy.next = newHead;
        
        current = newHead;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = head;
        
        return dummy.next;
    }
}


```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 0;
        ListNode currentNode = head;
        
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        
        int rotation = k % length;
        if (rotation == 0) {
            return head;
        }
        
        int stepsToNewHead = length - rotation;
        
        ListNode prev = null;
        currentNode = head;
        
        for (int i = 0; i < stepsToNewHead; i++) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        
        prev.next = null;
        
        ListNode newHead = currentNode;
        
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        
        currentNode.next = head;
        
        return newHead;
    }
}
```



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        int length = 1;
        while (fast.next != null) {
            fast = fast.next;
            length++;
        }

        k = k % length;

        for (int i = 0; i < length - k - 1; i++) {
            slow = slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next = null;

        return head;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RotateLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;

        k = k % length;
        k = length - k;

        while (k > 0) {
            current = current.next;
            k--;
        }

        head = current.next;
        current.next = null;

        return head;
    }

    public static void main(String[] args) {
        RotateLinkedList rotateLinkedList = new RotateLinkedList();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode rotatedList = rotateLinkedList.rotateRight(head, k);

        while (rotatedList != null) {
            System.out.print(rotatedList.val + " ");
            rotatedList = rotatedList.next;
        }
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = getLength(head);
        k = k % length;

        if (k == 0) {
            return head;
        }

        int stepsToNewHead = length - k - 1;
        ListNode current = head;

        while (stepsToNewHead > 0) {
            current = current.next;
            stepsToNewHead--;
        }

        ListNode newHead = current.next;
        current.next = null;
        current = newHead;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        return newHead;
    }

    private int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }
}



public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        ListNode curr = head;
        int count = 1;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        
        curr.next = head;
        k = k % count;
        
        for (int i = 0; i < count - k; i++) {
            curr = curr.next;
        }
        
        head = curr.next;
        curr.next = null;
        
        return head;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int count = 1; // count the number of nodes in the linked list
        ListNode temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }

        k = k % count; // take modulo of k to handle k > count

        // no rotation required if k is a multiple of count
        if (k == 0) {
            return head;
        }

        // find the new head and tail of the rotated list
        ListNode newHead = head;
        ListNode newTail = head;
        for (int i = 0; i < count - k - 1; i++) {
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;

        // find the last node of the original list and connect it to the old head
        temp.next = head;

        return newHead;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int count = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        k = k % count;
        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListRotation {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;

        int rotateSteps = length - k % length;
        for (int i = 0; i < rotateSteps; i++) {
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LinkedListRotation listRotation = new LinkedListRotation();

        // Test case 1: k < length of the list
        // Expected output: 4 -> 5 -> 1 -> 2 -> 3
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode result1 = listRotation.rotateRight(head1, 2);
        printList(result1);

        // Test case 2: k > length of the list
        // Expected output: 3 -> 4 -> 5 -> 1 -> 2
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(5);
        head2.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        ListNode result2 = listRotation.rotateRight(head2, 7);
        printList(result2);

        // Test case 3: Empty list
        // Expected output: null
        ListNode head3 = null;
        ListNode result3 = listRotation.rotateRight(head3, 5);
        printList(result3);
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
        }

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        
        int rotate = length - (k % length);
        if (rotate == length) {
            return head;
        }
        
        curr.next = head;
        while (rotate > 0) {
            curr = curr.next;
            rotate--;
        }
        
        ListNode newHead = curr.next;
        curr.next = null;
        
        return newHead;
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RotateLinkedList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RotateLinkedList rotateLinkedList = new RotateLinkedList();
        int k = 2;
        ListNode newHead = rotateLinkedList.rotateRight(head, k);

        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}




public class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        int count = 0;
        ListNode curr = dummy;
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        
        curr.next = dummy.next;
        
        int steps = count - (k % count);
        int i = 0;
        while (i < steps) {
            curr = curr.next;
            i++;
        }
        
        dummy.next = curr.next;
        curr.next = null;
        
        return dummy.next;
    }
}




class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
    }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        int count = 1;
        ListNode curr = head;
        
        while (curr.next != null) {
            count++;
            curr = curr.next;
        }
        
        curr.next = head;
        
        int stepsToRotate = count - (k % count);
        ListNode newHead = head;
        
        for (int i = 0; i < stepsToRotate; i++) {
            newHead = newHead.next;
            curr = curr.next;
        }
        
        curr.next = null;
        
        return newHead;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int size = 1;
        ListNode tail = head;
        
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }
        
        k = k % size;
        
        if (k == 0) {
            return head;
        }
        
        ListNode newTail = head;
        
        for (int i = 0; i < size - k - 1; i++) {
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        
        return newHead;
    }
}


import java.util.*;

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        int len = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            len++;
        }
        
        curr.next = head;
        
        k = k % len;
        int stepsToNewHead = len - k;
        
        for (int i = 0; i < stepsToNewHead; i++) {
            curr = curr.next;
        }
        
        ListNode newHead = curr.next;
        curr.next = null;
        
        return newHead;
    }
}


class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode tail = head;
        int length = 1;
        
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        int rotate = k % length;
        
        if (rotate == 0) {
            return head;
        }
        
        ListNode newTail = head;
        
        for (int i = 0; i < length - rotate - 1; i++) {
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        
        return newHead;
    }
}

