
public class ListTester {

    public static void main(String[] args) {

        CircularlyLinkedList<String> list1 = new CircularlyLinkedList<String>();

        System.out.println("Adding strings to the circular list.");
        list1.add(new String("A"));
        System.out.println(list1);
        list1.add(new String("B"));
        System.out.println(list1);
        list1.add(new String("C"));
        System.out.println(list1);
        list1.add(new String("D"));
        System.out.println(list1);
        list1.add(new String("E"));
        System.out.println(list1);
        list1.add(new String("F"));
        System.out.println(list1);
        list1.add(new String("G"));
        System.out.println(list1);
        list1.add(new String("H"));
        System.out.println(list1);
        list1.add(new String("I"));
        System.out.println(list1);

        System.out.println("\nPrinting out lists from a specific index.");
        for (int i = -1; i < 15; i++) {
            System.out.println("List starting from index " + i + ":");
            list1.display(i);
        }

        System.out.println("\nBefore remove");
        System.out.println(list1);
        System.out.println("After remove");
        for (int i=0;i<9;i++){
            list1.remove();
            System.out.println(list1);
        }

        System.out.println("josephe problem");
        CircularlyLinkedList<Integer> list2 = new CircularlyLinkedList<>();
        list2.add(1);
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        System.out.println();
        System.out.println(list2);
        // indexes start at zero so our k determine by the fact that indexing start at zero
        list2.josephe(2); // must be 4

        System.out.println("another josephe problem");
        CircularlyLinkedList<String> list3 = new CircularlyLinkedList<String>();
        list3.add(new String("A"));
        list3.add(new String("B"));
        list3.add(new String("C"));
        list3.add(new String("D"));
        list3.add(new String("E"));
        list3.add(new String("F"));
        list3.add(new String("G"));
        list3.add(new String("H"));
        list3.add(new String("I"));
        System.out.println();
        System.out.println(list3);
        // indexes start at zero so our k determine by the fact that indexing start at zero
        list3.josephe(4); // must be c

        System.out.println();
        System.out.println("what if k is bigger than size of list in josephe problem");
        CircularlyLinkedList<Integer> list4 = new CircularlyLinkedList<>();
        list4.add(1);
        list4.add(5);
        list4.add(4);
        list4.add(3);
        list4.add(2);
        //size is 5
        list4.josephe(8); // must be 2
    }

}
