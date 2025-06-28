public class insertAtIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
    public static class ll3{
        Node head=null;
        Node tail=null;

        void insertatIndex(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            for(int i=0;i<idx-1;i++){  //we have to got to one previous index where we wants to insert
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next =temp;
            }
            tail = temp;
        }
        int getAt(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp =temp.next;
            }
            return temp.data;
        }   
        
        void deleteAt(int idx){
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

    }
    public static void main(String args[]){
        ll3  b =new ll3();
        b.insertAtEnd(4); 
        b.insertAtEnd(5);
        b.insertAtEnd(3);
        b.insertatIndex(1,9);
        b.insertatIndex(3,2);
        b.display();
        System.out.println();
        b.deleteAt(2);
        b.display();
        // System.out.println();
        // System.out.print(b.getAt(3));
    }
}
