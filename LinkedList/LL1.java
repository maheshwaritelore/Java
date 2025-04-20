//Singlely linked list 
class LL1{
    Node head;
    private int size;

    LL1(){
        this.size=0;
       
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add-first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head =newNode;

    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //print
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("null");

    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;//head.next=null->lastNode=null
        while(lastNode.next !=null){//null.next ->error
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        LL1 list=new LL1();
        list.addFirst("A");
        list.addFirst("is");//is->A->null

        list.addLast("List");//is->A->List->null
        list.printList();

        list.addFirst("this");//this->is->A->List->null
        list.printList();

        list.deleteFirst();//is->A->List->null
        list.printList();

        list.deleteLast();//is->A->null
        list.printList();

        System.out.println(list.getSize());//2

        list.addFirst("this");//this->is->A->null
        list.printList();

        System.out.println(list.getSize());//3


    }
}

/*
is->A->List->null
this->is->A->List->null
is->A->List->null
is->A->null
2
this->is->A->null
3
*/