package linkedlist;

public class LinkedListService<T> {
    Node<T> head;
    //Method to add nodes at the front in the linked list
    public void add(T data)
    {
        Node<T> newNode = new Node<T>(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    //Method to append nodes at rear in the linked list
    public void append(T data)
    {
        Node<T> newNode = new Node<T>(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node<T> tempNode = head;
            while(tempNode.next != null)
            {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }
    //Method to insert a node between two nodes
    public void insertAfter(Node<T> prevNode, T data)
    {
        Node <T> newNode = new Node<T>(data);
        newNode.data = data;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    //Method to display linked list
    public void display()
    {
        Node<T> tempNode = head;
        while(tempNode.next != null)
        {
            System.out.print(tempNode.data +" -> ");
            tempNode= tempNode.next;
        }
        System.out.println(tempNode.data);
    }
    //Method to delete first element in the linked list
    public T pop()
    {
        if (head == null)
        {
            return null;
        }
        Node<T> tempNode = head;
        head = head.next;
        return tempNode.data;
    }
    //Method to delete last element in the linked list
    public T popLast()
    {
        Node<T> tempNode = head;
        while(tempNode.next.next!= null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return tempNode.data;
    }
}
