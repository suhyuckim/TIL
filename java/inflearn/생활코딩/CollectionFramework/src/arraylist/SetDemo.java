package arraylist;

import java.util.HashSet;
import java.util.Iterator;



public class SetDemo {

	public static void main(String[] args) {
		//집합을 프로그램화 시킨거임 
		HashSet<Integer> a = new HashSet<Integer>(); 
		a.add(1);
		a.add(2);
		a.add(3); 
		
		HashSet<Integer> b = new HashSet<Integer>();
		b.add(3);
		b.add(4);
		b.add(5);
		
		HashSet<Integer> c = new HashSet<Integer>();
		c.add(1);
		c.add(2);
		
		//containsAll : a라는 집합에 b라는 원소가 다 담겨져있는
		//a라는 집합안에 c원소가 다 들어있는  (부분집합)
		System.out.println(a.containsAll(b)); //false
		System.out.println(a.containsAll(c)); //true
		
		//a.addAll(b); //b전체를 a에다가 더한다. (합집합)
		//a.retainAll(b); //집합a에도 있고 집합b에도 있는 원소를 a에다가 담겠다. (교집합)
		a.remove(b); //a집합과 b집합에 있는 값을 뺀다. (차집합)
		
		Iterator hi = (Iterator) a.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}