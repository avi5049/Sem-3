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

    //declare a first and last node
    Node first = null;
    Node last = null;
    int length=0;

    //insert a first in circular linked linear list 
    public void insertFirst(int x){
        //create a new node and pass the element in constructor 
        Node newNode = new Node(x); 

        //linked list is empty then
        if(first==null){
            first = newNode;
            last = newNode;
            length++;
            return; 
        }
        //otherwise  
        last.link = newNode;
        newNode.link = first;
        first = newNode;
        length++;
    }

    //insert a Last in circular linked linear list 
    public void insertLast(int x){
        //create a new node and pass the element in constructor 
        Node newNode = new Node(x); 

        //linked list is empty then
        if(first==null){
            first = newNode;
            last = newNode;
            length++;
            return; 
        }
        //otherwise
        last.link=newNode;
        last = newNode;
        newNode.link=first;
        length++;  
    }

    //display all the node
    public void traversal(){
        Node save = first;
        while(save!=last){
            System.out.println(save.data);
            save=save.link;
        }
        System.out.println(save.data);
    }

    //delete at first Node

    public void deleteFirst(){
        if(first==null){
            System.out.println("list is empty");
            length--;
            return;
        }else if(first==last){
            last=first=null;
            length--; 
            return;
        }

        first = first.link;
        last.link=first;
        length--;
    }
    public void deleteLast(){
        if(first==null){
            System.out.println("list is empty");
            length--;
            return;
        }else if(first==last){
            last=first=null;
            length--; 
            return;
        }
        Node save = first;
        while(save.link!=last){
            save=save.link;
        }
        save.link=first;
        last = save;
        length--;
    }

    public void deleteIthPos(int i){
        Node save = first;
        if(length==i){
            deleteLast();
            return;
        }else if(0==i){
            System.out.println("list is empty");
            return;
        }
        Node pre=null;
        for (int j = 1; j <i; j++) {
            pre=save;
            save=save.link;
        }
        if(save==last){
            deleteLast();
            return;
        }
        if(save==first){
            deleteFirst();
            return;
        }
        pre.link=save.link;
    }
}

public class Lab_13a
{
    public static void main(String[] args) {

        LinkList linkedList = new LinkList();
        linkedList.insertLast(6);
        linkedList.insertLast(7);
        linkedList.insertLast(8);
        linkedList.insertLast(9);
        linkedList.insertLast(9);
        linkedList.insertLast(9);
        linkedList.deleteIthPos(6);
        linkedList.traversal();
        
    }
}

