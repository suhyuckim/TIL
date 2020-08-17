package coperation;

public class Student {
	String studentName;
	int grade, money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1250);
		money -= 1250;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1250);
		money -= 1250;
	}

	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 " +money+"원 입니다.");
	}
}