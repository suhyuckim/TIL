package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID);
		System.out.println(Student.getSerialNum());
		
		Student studentT = new Student();
		System.out.println(studentT.studentID);
		
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
	}
}