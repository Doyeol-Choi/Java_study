package chap1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex08Stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(500);
		stack.push(10);
		stack.push(50);
		stack.push(100);    
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("----------------------------------");
		Queue<Integer> q = new LinkedList<>();
		q.offer(500);
		q.offer(10);
		q.offer(50);
		q.offer(100);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
