package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학",  90);
		
		studentLee.showStudentInfo();
		
		System.out.println("===========");
		Student studentkim = new Student(1002, "Kim");
		studentkim.addSubject("국어", 100);
		studentkim.addSubject("수학",  90);
		studentkim.addSubject("영어",  80);
		
		studentkim.showStudentInfo();
	}
}
