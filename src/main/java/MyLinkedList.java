import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLinkedList {
    private Node head;
private int size;
    //add elements
    public void add(int value){
        //если первое добавление
        if(head==null){
            this.head = new Node(value);

        }else{
            Node temp = head;
while(temp.getNext() !=null)  {
    temp = temp.getNext();
}// 1 ->2->3
            temp.setNext(new Node(value));
        }
        size++;
    }
//get elements
    public int get(int index){
        int currentIndex = 0;
        Node temp = head;

        while(temp!=null){
            if(currentIndex==index){
                return temp.getValue();

            }else{
                temp = temp.getNext();
                currentIndex++;
// 1->2->3
            }
        }
        throw new IllegalArgumentException();

    }

    public void remove(int index){
        int currentIndex = 0;
        Node temp = head;

        while(temp!=null) {
            if((currentIndex+1)==index) {
        temp.setNext(temp.getNext().getNext());
        size--;
        return;
            }else{
                temp = temp.getNext();
                currentIndex++;

            }
            }
        }







//toString
    public String toString(){
        int[] result = new int[size];
        int idx=0;
        Node temp = head;
        while(temp!=null){
            result[idx++] = temp.getValue();

            temp = temp.getNext();

        }
        return Arrays.toString(result);

    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
this.value = value;

        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }
}
