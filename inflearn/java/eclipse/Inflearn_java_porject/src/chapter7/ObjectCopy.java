package chapter7;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray[0] = new Book("태백산맥1", "조정래");
		bookArray[1] = new Book("태백산맥2", "조정래");
		bookArray[2] = new Book("태백산맥3", "조정래");
		
		System.arraycopy(bookArray, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		bookArray[0].setBookName("나목");
		bookArray[0].setAuthor("박원석");
		
		for(int i=0; i<bookArray.length; i++) {
			bookArray[i].showBookInfo();
		}
		
		 System.out.println("==================");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = {"Java", "Android", "C"};
		
		for(String s : strArr) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}	