// search a position of key through iterative 


public class Linkedlist3 {
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



        // public static Node head;
    public int itrresearch(int key){
        Node temp=head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key){
                return i;

            }
            temp=temp.next;
            i++;
            
        }
        return -1;

    }
    public static void main(String[] args) {
        Linkedlist3 l1=new Linkedlist3();
         l1.addfirst(2);
         l1.addfirst(1);
         l1.addlast(4);
         l1.addlast(5);
         l1.add(2, 3);
         l1.print();
         System.out.println(l1.itrresearch(3));
         System.out.println(l1.itrresearch(100));

         
    }
    
}
