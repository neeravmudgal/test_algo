package stacks;


public class HybridStack implements Stack{
	private Chunk head;
	private int cs;
private class Chunk{
	Chunk(int size){
		this.s = new String[size];
	}
	int n=0;
	String s[];
	Chunk next;
}
public HybridStack(int chunkSize){
	this.cs = chunkSize;
	this.head = new Chunk(chunkSize);
}
@Override
public void push(String input) {
	if(head.n == cs){
		Chunk old = head;
		head = new Chunk(cs);
		head.next = old;
	}
	head.s[head.n++]=input;
}

@Override
public String pop() {
	if(head.n<=0){
		head = head.next;
	}
	String poped = head.s[--head.n];
	head.s[head.n] = null;
	return poped;
}
}
