package coperation;

public class Bus {
	int busNumber, passengerCount, money;
	
	public Bus(int busNumeber) {
		this.busNumber = busNumeber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은"
				+money+"원 입니다.");
	}
}
