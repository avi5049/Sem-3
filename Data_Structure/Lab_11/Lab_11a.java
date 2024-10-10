import java.util.*;
//. Write a program to implement stack using singly linked list.

//create a node class
class Node {
    int data;
    Node link;

    public Node(int data){
        this.data = data;
        this.link = null;
    } 
}

class Stack{
	//initialize first with null
	Node first=null;

	//implement a push method 
	public void push(int x){
		Node newNode = new Node(x);
		Node save = first;
		//first is null
		if(save == null){
			first=newNode;
			return;
		}

		//goes to last node 
		while(save.link!=null){
			save = save.link;
		}

		//In last node push a newNode  
		save.link = newNode;

	}

	//implement a pop method 
	public int pop(){
		Node save = first;
		//first is null then
		if(save == null || save.link==null){
			first=null;
			return -1;
		}

		//predecesor 
		Node pre = null;

		//goes to last node 
		while(save.link!=null){
			pre = save;
			save = save.link;
		}

		//In last delete node  
		pre.link = null;
		return save.data;

	}

	//print a stack
	public void printStack()
	{
		Node save = first;
		while(save!=null){
			System.out.print(save.data + " ");
			save=save.link;
		}
	}
}
public class Lab_11a{
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.pop();
	}
}