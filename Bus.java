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
		System.out.println("버스" + busNumber + "번의 승객은"+ passengerCount 
							+ "명이고, 수입은 "+ money + "입니다.");
	}
	
	public void setbusNumber(int busNumber) {
		if(busNumber > 0) {
		this.busNumber = busNumber;
		}else {
			System.out.println("번호를 0보다 큰 수로 다시 입력하세요");
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
