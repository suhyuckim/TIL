package Section1;

public class Code1_2 {

	public static void main(String[] args) {
		Person1 first;
		first = new Person1(); //new가 생성하는 것을 객체라고 함
		
		first.name = "Kim";
		first.number = "01012341234";
		
		System.out.println("Name : "+first.name+ ", number : "+first.number);
		
		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "010-1231-1234";
		
		System.out.println("Name : "+members[1].name+ ", number : "+members[1].number);
	}
}