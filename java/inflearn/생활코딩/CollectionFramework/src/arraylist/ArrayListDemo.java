package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "1";
		arrayObj[1] = "2";
		arrayObj[2] = "3"; //오류 발생
		for(int i=0; i<arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList a1 = new ArrayList(); //object 타입으로 저장되있다.
		a1.add(1);
		a1.add(2);
		a1.add(3);
		for(int i=0; i<a1.size(); i++) {
			String value = (String)a1.get(i); //object타입이기 때문에 String타입으로 형변환해줘야한다.
			System.out.println(a1.get(i));
		}
	}
}