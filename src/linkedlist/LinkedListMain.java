package linkedlist;

public class LinkedListMain {
    public static void main(String[] args)
    {
        LinkedListService<Integer>linkedListObj = new LinkedListService<Integer>();
        linkedListObj.add(56);
        linkedListObj.add(30);
        linkedListObj.add(70);
        linkedListObj.display();
        System.out.println("Using add method");
        LinkedListService<Integer>linkedListObj1 = new LinkedListService<Integer>();
        linkedListObj1.add(70);
        linkedListObj1.add(30);
        linkedListObj1.add(56);
        linkedListObj1.display();
        System.out.println("Using append method");
        LinkedListService<Integer>linkedListObj2 = new LinkedListService<Integer>();
        linkedListObj2.append(56);
        linkedListObj2.append(30);
        linkedListObj2.append(70);
        linkedListObj2.display();
        System.out.println("Insert a node 30 between 56 and 70");
        LinkedListService<Integer>linkedListObj3 = new LinkedListService<Integer>();
        linkedListObj3.append(56);
        linkedListObj3.append(70);
        linkedListObj3.insertAfter(linkedListObj3.head,30);
        linkedListObj3.display();
    }
}
