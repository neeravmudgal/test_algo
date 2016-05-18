package stacks;

import stopwatch.StopWatch;

public class TestStack {
	public static void main(String[] args) {
		Stack stack= new ArrayStack(10);
		testStack(stack);
		System.out.println("||||||||||||||||||");
		testStack(new LinkedListStack());
		System.out.println("||||||||||||||||||");
		testStack(new HybridStack(1000));
	
	}

	private static void testStack(Stack stack) {
		StopWatch sw = new StopWatch();
		sw.start();
		for(int i = 0;i<20000000;i++){
			stack.push(i+"abc");
		}
		sw.stop();
		System.out.println("????????????????????");
		sw.start();
		for(int i = 0;i<20000000;i++){
			stack.pop();
		}
		sw.stop();
	}
}
