
public class CircularlyLinkedList<E> {

    // NOTE: This linked list can store objects that are not Comparable

    // DO NOT ADD ANY ADDITIONAL FIELDS FOR THIS EXERCISE
    private Node<E> head;
    private int numElements;

    public CircularlyLinkedList() {
        head = null;
        numElements = 0;
    }

    //for size
    public Integer size(){
        return numElements;
    }

    public String toString() {
        String result = "numElements = " + numElements + ": ";
        if (head != null) {
            Node<E> nodePtr = head;
            do {
                result += nodePtr.data + " ";
                nodePtr = nodePtr.next;
            } while (nodePtr != head);
        }
        return result;
    }

    public void add(E element) {
        int size=numElements;
        //if the list is empty
        if (size==0){
            Node<E> temp=new Node<>(element);
            head=temp;
            temp.setNext(head);
            numElements++;
        }
        //if the list has one element
        if (size==1){
            Node<E> temp=new Node<>(element);
            temp.setNext(head);
            head.setNext(temp);
            numElements++;
        }
        //else
        if (size>=2){
            Node<E> temp=new Node<>(element);
            temp.setNext(head.getNext());
            head.setNext(temp);
            numElements++;
        }
    }

    public void display(int index) {
        //if our index is negative
        if (index < 0){
            System.out.println("ERROR!!!. index can't be negative");
        }
        if (index >= 0 && index < numElements){
            int counter=0;
            Node<E> temp=head;
            while (counter!=index){
                temp=temp.getNext();
                counter++;
            }
            System.out.println(temp.getData());
        }
        if (index>=numElements){
            index=index % numElements;
            int counter=0;
            Node<E> temp=head;
            while (counter!=index){
                temp=temp.getNext();
                counter++;
            }
            System.out.println(temp.getData());
        }
    }

    public void remove(){
        int size=numElements;
        if (size == 0){
            System.out.println("ERROR!!!. the list is empty");
        }
        if (size == 1){
            head.setNext(null);
            head=null;
            numElements--;
        }
        if (size > 1){
            Node<E> remove=head.getNext();
            head.setNext(remove.getNext());
            numElements--;
        }
    }

    private void remove_index(int index){
        int size=numElements;
        if (size==0){
            System.out.println("empty list");
        }
        if (size==1){
            head.setNext(null);
            head=null;
            numElements--;
            return;
        }
        if (index==0 && size>1){
            Node<E> temp=head;
            Node<E> temp_next=head.getNext();
            while (temp.getNext()!=head){
                temp=temp.getNext();
            }
            temp.setNext(temp_next);
            head.setNext(null);
            head=temp_next;
            numElements--;
        }
        if (index == size-1 && size>1){
            Node<E> temp=head;
            while (temp.getNext().getNext()!=head){
                temp=temp.getNext();
            }
            Node<E> temp_next=temp.getNext();
            temp.setNext(head);
            temp_next.setNext(null);
            numElements--;
        }
        if (index>0 && index<size-1){
            int counter=0;
            Node<E> temp=head;
            while (counter!=index-1){
                temp=temp.getNext();
                counter++;
            }
            Node<E> temp_next=temp.getNext();
            temp.setNext(temp_next.getNext());
            temp_next.setNext(null);
            numElements--;
        }
    }

    public void josephe(int k){
        if (numElements==0 || numElements==1){
            System.out.println("empty list or there is only 1 element");
        }
        int start=0;
        while (true){
            start=(start+k)%numElements;
            remove_index(start);
            if (numElements==1){
                System.out.println("Safe position is " + head.getData());
                break;
            }
        }
    }



    private static class Node<E> {

        private E data;
        private Node<E> next;

        public Node(E element) {
            data = element;
            next = null;
        }
        //--------------setters---------------------------------------
        public void setNext(Node<E> next) {
            this.next = next;
        }
        public void setData(E data) {
            this.data = data;
        }
        //--------------getters---------------------------------------
        public Node<E> getNext() {
            return next;
        }
        public E getData() {
            return data;
        }
    }

}
