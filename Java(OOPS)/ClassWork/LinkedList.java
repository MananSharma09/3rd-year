public  class LinkedList {
    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int size;

    LinkedList(){
        this.head=null;
    }

    public void addLast(int data)
    {
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node current = head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
    }

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }

    public void print()
    {
        Node current=head;
        while (current != null) {
            System.out.println(current.data);
            current=current.next;
        }
    }

    public void deletefirst()
    {
        if(size==0)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(head==tail)
        {
            head=null;
            tail=null;
            return;
        }
        else
        {
            Node temp=head.next;
            head.next=null;
            head=temp;
            
        }
    }

    public void deletelast()
    {
        if(size==0)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(head==tail)
        {
            head=null;
            tail=null;
            return;
        }
        else
        {
            Node curr=head;
            while(curr.next.next!=null)
            {
                curr=curr.next;
            }
            curr.next=null;
        }
    }


    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(0);
        list.deletefirst();
        list.deletelast();
        list.print();
    }
}
