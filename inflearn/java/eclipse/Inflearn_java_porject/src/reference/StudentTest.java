package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJames = new Student(100, "James");
		studentJames.setKorea("국어", 100);
		studentJames.setMath("수학", 100);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setKorea("국어", 100);
		studentTomas.setMath("수학", 100);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
