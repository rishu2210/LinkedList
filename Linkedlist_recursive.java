public class  Linkedlist_recursive{
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void displayreverse(Node head){
        if(head==null) return;
        displayreverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next !=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
    } 

    public static int length(Node head){
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static class Node{
        int data; // value
        Node next; //address of next node
        Node(int data){
            this.data = data; //The this keyword is used to refer to the current object instance.
        }
    }

    public static void main(String args[]){
        Node a = new Node(5); //head node
        // System.out.println(a.next); //null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next=b; //5-> 3 9 8 16
        // System.out.println(a.next); //Linkedlist1$Node@2f92e0f4
        // System.out.println(b);  //Linkedlist1$Node@2f92e0f4
    //     System.out.println(a.next.data);
    //    System.out.println(a.data); //5
        b.next=c; //5->3->9 8 16
        c.next=d;//5->3->9->8 16
        d.next=e;//5->3->9->8->16
        // display(a);
        // System.out.println();
        // displayr(a);
        // System.out.println(); 

        // displayreverse(a);
        System.out.println(length(a));
    }
}   
