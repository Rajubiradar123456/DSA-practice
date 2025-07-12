// adding first ,last and  middle

public class Linkedlist1 {
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


        // adding first
        public void addfirst(int data){
            Node newnode=new Node(data);
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
            Node temp=head;
            int i=0;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
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
            Linkedlist1 l1=new Linkedlist1();
            l1.addfirst(2);
            l1.addfirst(1);
            l1.addlast(4);
            l1.addlast(5);
            l1.add(2, 3);
            l1.print();

        
    }
}
