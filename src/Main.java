import org.w3c.dom.Node;

public class Main {
    public void insertfirst (int value){
        ListNode newNode = new ListNode (value);
        newNode.next = head;
        head= newNode;
    }

    public static void main(String[] args) {
        Main sll =new Main();
        sll.insertfirst(11);
        sll.insertfirst(8);
        sll.insertfirst(1);
        sll.displays();
        public void insertlast (int value){
            ListNode newNode = new ListNode(value);
           if(head == null){
               head = newNode;
               return;
           }
        }
    }

    public static void main(String[] args) {
        Main sll = new Main();
        sll.insertlast (11)
    }
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }
    public void displays(){
        ListNode current = head;
        while (current == head);
        while (current != null){
            System.out.print(current.data +"->");
            current =current.next;
        }
        System.out.print("null");
    }
    public int length () {
        if (head == null) {return 0;}
        int count =0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
