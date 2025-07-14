public class Linkedlistpalindrome {
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

      public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
      }
      public boolean checkpalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node miNode=findmid(head);
        Node prev=null;
        Node curr=miNode;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        Node right=prev;
        Node left=head;

         while(right!=null){
        if(left.data != right.data){
            return false;
        }
        left=left.next;
        right=right.next;
      }
      return true;
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
           Linkedlistpalindrome l1=new Linkedlistpalindrome();
            l1.addfirst(2);
            l1.addfirst(1);
            l1.addfirst(2);
            // l1.addfirst(2);
          
            l1.print();
            System.out.println(l1.checkpalindrome());

        
    }
}
