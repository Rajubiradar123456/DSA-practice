// delete at first and last
public class Linkedlist2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;


        // adding first
        public void addfirst(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=newnode;
                return ;
            }
            newnode.next=head;
            head=newnode;
        }

        // add at last
        public void addlast(int data){
            Node newnode=new Node(data);
            size++;
            if(head==null){
                head=tail=newnode;
                return ;
            }
            tail.next=newnode;
            tail=newnode;
        }

        // add at middle
        public void add(int idx,int data){
            if(idx==0){
                addfirst(data);
                return;
            }
            Node newnode=new Node(data);
            size++;
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }


        // delete first
        public int deletefirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }

        // delete at last
        public int deletelast(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            Node prev=head;
            for(int i=0;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }


        // printing the linkedlist
        public void print(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            Linkedlist2 l1=new Linkedlist2();
            l1.addfirst(2);
            l1.addfirst(1);
            l1.addlast(4);
            l1.addlast(5);
            l1.add(2, 3);
            l1.print();
            l1.deletefirst();
            l1.print();
            l1.deletelast();
            l1.print();

        
    }
    
}
