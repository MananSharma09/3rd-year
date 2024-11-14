public class CircularLL {
    
    private Node head;
    private Node tail;

    public CircularLL()
    {
        this.head=null;
        this.tail=null;
    }

    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return ;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

    public void display()
    {
        Node node=head;
        if(head!=null)
        {
            do{
                System.out.print(node.val+" -> ");
                node=node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    private class Node{
        int val;
        Node next;

        public Node (int val){
            this.val=val;
        } 
    }

    public static void main(String[] args) {
        CircularLL list=new CircularLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
    }
}