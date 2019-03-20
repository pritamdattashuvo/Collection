import java.util.PriorityQueue;
import java.util.Stack;

public class Student {
	
	public static void main(String args[]) {
		String emp_id,emp_name,emp_salary,emp_dept;
		String data[] = {"101","Pritam","1050000","IT"};
//		Stack<String> list = new Stack<String>();
//		list.push("Rubel");
//		list.push("Sakib");
//		list.push("Imtiaz");
//		System.out.println(list);
//		list.pop();
//		System.out.println();
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue.add("pritam datta");//offer instead of add
		pQueue.add("Rubel rahaman");
		pQueue.add("Jafor");
		System.out.println(pQueue);
	}
}
