package chapter5;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(); //클래스 생성하기 (인스턴스화)
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "서울 관악구 여의도동";
			
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}