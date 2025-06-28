public class insertll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
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

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                if(temp.next!=null){
                    System.out.print("->");
                }
                temp=temp.next; 
            }
        }
        int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count ++;
                temp=temp.next;
            }
            return count;
        }


    }
    public static void main(String args[]){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(3);
        ll.display();
        System.out.println();
        System.out.println(ll.size());

    }
}
