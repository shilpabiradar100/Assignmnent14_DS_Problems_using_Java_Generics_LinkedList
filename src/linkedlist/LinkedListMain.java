package linkedlist;

public class LinkedListMain {
    public static void main(String[] args)
    {
        LinkedListService<Integer>linkedListObj = new LinkedListService<Integer>();
        linkedListObj.add(56);
        linkedListObj.add(30);
        linkedListObj.add(70);
        linkedListObj.display();
        //Here we can get sequence i.e 56 -> 30 ->70
        System.out.println("Using add method");
        LinkedListService<Integer>linkedListObj1 = new LinkedListService<Integer>();
        linkedListObj1.add(70);
        linkedListObj1.add(30);
        linkedListObj1.add(56);
        linkedListObj1.display();
    }
}
