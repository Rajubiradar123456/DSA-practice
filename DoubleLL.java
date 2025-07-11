// add first,last and delete first,last


public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return ;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    public void addlast(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=newnode;
                return ;
            }
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }

    public int deletefirst(){
        if(head==null){
            System.out.println("empty");
             return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }    

    public int deleteLast() {
        if (size==0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    public void print(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }


    public static void main(String[] args) {
        DoubleLL l1=new DoubleLL();
      l1.addfirst(3);
        l1.addfirst(2);
        l1.addlast(4);
        l1.addlast(5);
        l1.print(); // Expected: 2 <-> 3 <-> 4 <-> 5 <-> null

        l1.deletefirst();
        l1.print(); // Expected: 3 <-> 4 <-> 5 <-> null

        l1.deleteLast();
        l1.print(); 
    }
}
