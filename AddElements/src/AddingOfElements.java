import java.util.*;
public class AddingOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Before adding 5 : " + list);
		ListIterator<Integer> it=list.listIterator(11);
		while(it.hasNext()) {
			it.add(5);
			it.add(6);
			it.add(7);
			it.add(8);
			it.add(9);
			it.add(10);
			it.next();
		}
		System.out.println("After adding 5 : "+list);
	}

}
