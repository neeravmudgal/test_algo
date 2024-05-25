package stacks;

public class ArrayStack implements Stack{
	private String[] s;
	private int N = 0;
	public ArrayStack(int initialSize){
		this.s = new String[initialSize];
	}
	public void push(String input){
		s[N++] = input;
		if(N == s.length) resize(2 * s.length);
	}
	public String pop(){
		String poped = s[--N];
		s[N] = null;
		if(N > 0 && N == s.length/4) resize(s.length/2);
		return poped;
	}
	
	private void resize(int newLength){
		//System.out.println("RESIZING : " + newLength);
		String[] copy =new String[newLength];
		for(int i =0;i< N;i++){ 
			copy[i] = s[i];
		}
		s=copy;
	}
}
