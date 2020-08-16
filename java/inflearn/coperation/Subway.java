package coperation;

public class Subway {
	int lineNumber, passengerCount, money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"호선의 승객은 "+passengerCount+"명이고, 수입은"
				+money+"원 입니다.");
	}
}