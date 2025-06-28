public class insertAtHead {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class ll2{
        Node head=null;
        Node tail=null;
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            } 
        }
        
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String args[]){
        ll2  a = new ll2();
        a.insertAtBeginning(3);
        a.insertAtBeginning(5);
        a.display();
    }
    
}
   