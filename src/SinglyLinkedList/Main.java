package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.removeFirst();
        list.display();


    }
}
