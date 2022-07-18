package quiz;

public class Bus {
	private int busNumber;
	int passengerCount;
	int money;
	private int busIncome;
	
	public Bus(int busNumber, int passengerCount, int money) {
		setbusNumber(busNumber);
		this.passengerCount = passengerCount;
		this.money = money;
		
		
	}
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°���"+ passengerCount 
							+ "���̰�, ������ "+ money + "�Դϴ�.");
	}
	
	public void setbusNumber(int busNumber) {
		if(busNumber > 0) {
		this.busNumber = busNumber;
		}else {
			System.out.println("��ȣ�� 0���� ū ���� �ٽ� �Է��ϼ���");
		}
	}
	
	public void takeBus() {
		this.setBusIncome(this.getBusIncome() - 1000); 
		this.passengerCount += 1;
		
	}

	public int getBusIncome() {
		return busIncome;
	}

	public void setBusIncome(int busIncome) {
		this.busIncome = busIncome;
	}

}
