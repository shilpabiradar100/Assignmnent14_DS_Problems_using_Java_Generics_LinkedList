package linkedlist;

public class LinkedListMain {
    public static void main(String[] args)
    {
        LinkedListService<Integer>linkedListObj = new LinkedListService<Integer>();
        linkedListObj.add(56);
        linkedListObj.add(30);
        linkedListObj.add(70);
        linkedListObj.display();
    }
}
