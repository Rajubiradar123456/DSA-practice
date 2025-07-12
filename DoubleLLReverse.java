



public class DoubleLLReverse {
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


    public void reverse(){
            Node curr=head;
            Node prev=null;
            Node next;

            while (curr!=null) {
                next=curr.next;
                curr.next=prev;
                curr.prev=next;// this one line only change in double LL
                prev=curr;
                curr=next;
                
            }
            head=prev;
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
        DoubleLLReverse l1=new DoubleLLReverse();
      l1.addfirst(3);
       l1.addfirst(2);
            l1.addfirst(1);
            l1.addlast(4);
            l1.addlast(5);
            l1.print();
            l1.reverse();
            l1.print();
    }
}
