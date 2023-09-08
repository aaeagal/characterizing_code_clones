
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RotateLinkedList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 1;
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        
        k = k % length;
        if (k == 0) {
            return head;
        }
        
        curr.next = head;
        curr = head;
        
        for (int i = 0; i < length - k - 1; i++) {
            curr = curr.next;
        }
        
        head = curr.next;
        curr.next = null;
        
        return head;
    }
    
    public static void main(String[] args) {
       // create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
       
        int k = 2;
        
        // rotate the linked list
        ListNode newHead = rotateRight(head, k);
        
        // print the rotated linked list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
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

public class RotateLinkedList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k %= length;
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

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode rotatedList = rotateRight(head, k);

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

public class RotateLinkedList {
    
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 1;
        ListNode curr = head;
        while (curr.next != null) {
            length++;
            curr = curr.next;
        }
        
        int rotateBy = k % length;
        if (rotateBy == 0) {
            return head;
        }
        
        curr.next = head;
        ListNode newTail = head;
        for (int i = 0; i < length - rotateBy - 1; i++) {
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int k = 2;
        
        ListNode rotatedHead = rotateRight(head, k);
        
        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
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
        
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        
        for (int i = 1; i < stepsToNewHead; i++) {
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
  ListNode(int x) { val = x; }
}

public class RotateList {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    
    int len = 1;
    ListNode curr = head;
    while (curr.next != null) {
      curr = curr.next;
      len++;
    }
    
    k = k % len;
    if (k == 0) {
      return head;
    }
    
    curr.next = head;
    int stepsToNewHead = len - k;
    while (stepsToNewHead > 0) {
      curr = curr.next;
      stepsToNewHead--;
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
        
        int steps = length - k;
        ListNode newHead = head;
        
        while (steps > 1) {
            newHead = newHead.next;
            steps--;
        }
        
        ListNode temp = newHead.next;
        newHead.next = null;
        tail.next = head;
        
        return temp;
    }
}
public class LinkedListRotation {
    
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        int rotate = k % size;
        if (rotate == 0)
            return head;

        curr = head;
        for (int i = 0; i < size - rotate - 1; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;
        curr = newHead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;

        return newHead;
    }
    
    class ListNode {
        int val;
        ListNode next;
        
        public ListNode(int val) {
            this.val = val;
        }
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
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        k = k % count;
        if (k == 0) {
            return head;
        }
        
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        ListNode newHead = slow.next;
        fast.next = head;
        slow.next = null;
        
        return newHead;
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        Solution solution = new Solution();
        int k = 2;
        ListNode rotatedList = solution.rotateRight(head, k);
        
        while (rotatedList != null) {
            System.out.print(rotatedList.val + " ");
            rotatedList = rotatedList.next;
        }
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
        
        ListNode newHead = head;
        ListNode newTail = head;
        
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }
        
        newHead = newTail.next;
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
        this.next = null;
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
        
        int stepsToMove = length - k;
        ListNode newHead = head;
        ListNode current = head;
        
        while (stepsToMove > 1) {
            current = current.next;
            stepsToMove--;
        }
        
        newHead = current.next;
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

class Solution {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    
    int length = 1;
    ListNode tail = head;
    while (tail.next != null) {
      tail = tail.next;
      length++;
    }
    
    if (k % length == 0) {
      return head;
    }
    
    k = length - (k % length);
    tail.next = head;
    ListNode newTail = tail;
    
    while (k > 0) {
      newTail = newTail.next;
      k--;
    }
    
    ListNode newHead = newTail.next;
    newTail.next = null;
    
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

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
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
        
        int stepsToNewHead = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }
        
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        
        return newHead;
    }
}

public class LinkedListRotation {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = getLength(head);
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

    private int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
}
class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

public class LinkedListRotation {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    
    ListNode curr = head;
    int size = 1;
    while (curr.next != null) {
      curr = curr.next;
      size++;
    }
    
    curr.next = head;
    k = size - (k % size);
    for (int i = 0; i < k; i++) {
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

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
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

        current.next = head; // Make the linked list a circular one

        int rotation = k % length; // Calculate the actual rotation index

        int breakPoint = length - rotation;
        current = head;

        for (int i = 0; i < breakPoint - 1; i++) {
            current = current.next;
        }

        ListNode newHead = current.next;
        current.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        LinkedListRotation solution = new LinkedListRotation();
        ListNode rotatedHead = solution.rotateRight(head, k);

        while (rotatedHead != null) {
            System.out.print(rotatedHead.val + " ");
            rotatedHead = rotatedHead.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = getLength(head);
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
    
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Main {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int length = 0;
        ListNode curr = head;
        ListNode tail = null;
        
        while (curr != null) {
            length++;
            tail = curr;
            curr = curr.next;
        }
        
        k = k % length; // Adjust k if it exceeds the length of the list
        
        if (k == 0) {
            return head;
        }
        
        curr = head;
        
        for (int i = 0; i < length - k - 1; i++) {
            curr = curr.next;
        }
        
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;
        
        return newHead;
    }
    
    public static void main(String[] args) {
        // Test the rotateRight method
        
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int k = 2;
        ListNode newHead = rotateRight(head, k);
        
        // Output the rotated linked list: 4 -> 5 -> 1 -> 2 -> 3
        ListNode curr = newHead;
        
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        int count = 1;
        ListNode tail = head;
        
        while (tail.next != null) {
            count++;
            tail = tail.next;
        }
        
        tail.next = head;
        k = k % count; // reduce k if it is larger than count
        
        int stepsToNewHead = count - k;
        
        while (stepsToNewHead > 0) {
            head = head.next;
            tail = tail.next;
            stepsToNewHead--;
        }
        
        tail.next = null;
        return head;
    }
}

public class ListNode {
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

        int stepsToNewHead = length - k;
        ListNode newTail = head;

        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }

    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        RotateLinkedList solution = new RotateLinkedList();
        ListNode newHead = solution.rotateRight(head, k);

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
        
        int length = 0;
        ListNode temp = head;
        
        while (temp != null) {
            length++;
            temp = temp.next;
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
}
