package quiz;

public class Subway {
	private String lineNumber;
	int passengerCount;
	int money;
	private int subIncome;
	
	public Subway(String lineNumber, int passengerCount, int money) {
		this.lineNumber = lineNumber;
		this.passengerCount = passengerCount;
		this.money = money;
		
		
	}
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°���"+ passengerCount 
							+ "���̰�, ������ "+ money + "�Դϴ�.");
	}

	public int getSubIncome() {
		return subIncome;
	}

	public void setSubIncome(int subIncome) {
		this.subIncome = subIncome;
	}
	
	public void takeSubway() {
		this.subIncome -= 1500; 
		this.passengerCount += 1;
		
	}
}
