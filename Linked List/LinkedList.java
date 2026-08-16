public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            tail=head=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //add in middle
    public void add(int index,int data){
        if(index==0){
            addFirst(data);//if add head
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);ll.print();
        ll.addFirst(1);ll.print();
        ll.addLast(3);ll.print();
        ll.addLast(4);ll.print();
        ll.add(2,6);ll.print();
        
    }
}