package stacks;

public class LinkedListStack implements Stack{
	private Node head;
private class Node{
	String s;
	Node next;
}
public LinkedListStack(){
}
@Override
public void push(String input) {
	Node old = head;
	head = new Node();
	head.s = input;
	head.next = old;
}

@Override
public String pop() {
	String val = head.s;
	head = head.next;
	return val;
}
}
