import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class RemovalOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		System.out.println(numbers);
		Iterator<Integer> itr=numbers.iterator();
		while(itr.hasNext()) {
			int number=itr.next();
			if(number==4) {
				itr.remove();
			}
		}
		System.out.println(numbers);
	}

}
