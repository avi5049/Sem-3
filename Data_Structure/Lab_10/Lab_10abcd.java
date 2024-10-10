import java.util.*;
class Node {
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    } 
}
class LinkList {
    
    Node first = null;
    int length=1;
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }
        newNode.link = first;
        first = newNode;
        length++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }
        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
        length++;
    }

    public void traversal() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
    public void insord(int x) {
        Node newNode = new Node(x);
        if (first == null || first.data > x) {
            newNode.link = first;
            first = newNode;
        } else {
            Node save = first;
            while (save.link != null && save.link.data <= x) {
                save = save.link;
            }
            newNode.link = save.link;
            save.link = newNode;
        }
        length++;
    }
    public void deleteAtFirst(){
        Node save = first;
        if(save == null){
            System.out.println("LL is empty");
            return;
        }
        save = save.link;
        length--;
    }

    public void deleteAtLast(){
        if(first == null){
            System.out.println("LL is empty");
            return;
        }
        Node save=first;
        while (save.link.link!=null) {
            save=save.link;
        }
        save.link = null;
        length--;
    }
    public void insertAtPosition(int data,int i){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
            return;
        }else if(i>length){
            return;
        }else if(i==0){
            insertFirst(data);
            return;
        }
        Node save = first;
        int count=1;
        while(count<i){
            save = save.link;
            count++;
        }
        newNode.link = save.link;
        save.link = newNode;

    }
    public boolean compareTwoLL(LinkList l){
        Node save1=this.first;
        Node save2=l.first;
        if(save1==null || save2==null || this.length!=l.length ){
            return false;
        }
        while(save1!=null  && save2!=null){
            if(save1.data!=save2.data){
                return false;
            }
            save1=save1.link;
            save2=save2.link;
        }

        return true;
    }
}

public class Lab_10abcd
{
    public static void main(String[] args) {

        LinkList linkedList1 = new LinkList();
        LinkList linkedList2 = new LinkList();

        linkedList1.insertFirst(80);
        linkedList1.insertFirst(70);
        linkedList1.insertFirst(50);
        linkedList2.insertFirst(80);
        linkedList2.insord(70);
        linkedList2.insertFirst(50);
        // linkedList.insertAtPosition(90,1);
        // linkedList2.traversal();
        // System.out.println(LinkList.length);
        System.out.println("ans : " + linkedList1.compareTwoLL(linkedList2));
    }
}
