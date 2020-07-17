package chapter5;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {} //생성자
	
	public Student(int id, String name) { 
		studentID = id;
		studentName = name;
	} 
	
	public void showStudentInfor() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudent() { //클래스에서 메소드 구현
		return studentName;
	}
	
	public void setStudentName(String name) { //student 이름 바꾸기
		studentName = name;
	}
}