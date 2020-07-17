package chapter7;

public class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = new int[] {0,1,2}; // 배열의 초기화
		int[] numbers2 = {0,1,2}; // 배열의 초기화
		int[] numbers3 = new int[3];
		
		numbers3[0] = 1;
		numbers3[1] = 2;
		numbers3[2] = 3;
		
		for(int i=0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
		
		System.out.println("배열 길이 : "+numbers.length); //배열의 길이
	}
}