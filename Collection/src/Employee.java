//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//public class Employee {
//	public static void main(String[] args) {
//		//Class Date: 6/3/2019 
//		String emp_id,emp_name,emp_salary,emp_dept;
//		String data[] = {"101","Pritam","1050000","IT"};
//		String data1[] = {"102","Rubel","1050000","IT"};
//		List<String> list= new ArrayList<String>();
//		ArrayList<String> list1 = new ArrayList<String>();
////		list.add(data[1]);
////		System.out.println(list);
//		
////		for(int i=0;i<data.length;i++) {
////			list.add(data[i]);
////		}
////		System.out.println(list);
////		list.clear();
////		System.out.println(list);
////		for(int i=0;i<data.length;i++) {
////			list.add(data[i]);
////			list1.add(data1[i]);
////		}
////		System.out.println("SIZE OF DATA: "+list.size());
////		list.addAll(4,list1);
////		System.out.println(list);
//		//Class Date: 7/3/2019 
////		List<String> list3= new ArrayList<String>();//pushing list in Arraylist
////		list3.add("Sakib");
////		list3.add("103");
////		String y[]= {"PRITAM","DATTA"};
////		for(String x: y) 
////			System.out.println(x);
////		
////		for(String k: y)
////			list3.add(k);
//		LinkedList<String> list4 = new LinkedList<String>();
//		list4.add("Mir");
//		list4.add("10");
//		list4.add("CSE");
//		for(String p: list4)
//			System.out.println(p);
//		list4.addFirst("Miracle");
////		System.out.println(list4);
//		list4.addLast("India");
////		System.out.println(list4);
//		list4.push("Miraaa");
////		list4.pop();
////		list4.remove();
////		list4.remove();
//		System.out.println(list4);
//		String x = list4.get(1);
////		System.out.println(x);
//		x= list4.getFirst();
////		System.out.println(x);
////		list4.subList(2, 5).clear();
////		System.out.println("Using sublist(2,5): "+list4.subList(2,5));
//		Employee emp = new Employee();
//		emp.removefromto(2, 5, list4);
//		System.out.println(list4);
//		
//		System.out.println("NEW PAYMENT PROJECT");
//		String bkash[] = {"pritam","datta","feni","1500","Bangladesh"};
//		String paypal[] = {"abdur","rahman","dhaka","1500","Bangladesh"};
//		LinkedList<String> newlist1 = new LinkedList<String>();
//		LinkedList<String> newlist2 = new LinkedList<String>();
//		
//		for(String pp: bkash) {
//			newlist1.add(pp);
//		}
//		for(String qq: paypal) {
//			newlist2.add(qq);
//		}
//		newlist1.addAll(newlist2);
//		System.out.println(newlist1);//full list combined
//		System.out.println("bkash: "+newlist1.subList(0,4));
//		System.out.println("paypal: "+newlist1.subList(5,9));
//		System.out.println("After converting to array: ");
//		String a[] = newlist1.toArray(new String[newlist1.size()]);
//		for(String pp: a) {
//			System.out.println(pp);
//		}
//	}
//	public void removefromto(int from, int to, LinkedList<String>l1) {
//		l1.subList(from, to).clear();
//	}
//
//}