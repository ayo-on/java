package quiz;

import java.util.Scanner;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void ride() {
		 Bus bus100 = new Bus(100);
         Subway subwayLine2 = new Subway("2호선");
     System.out.println("승차할 교통수단을 선택하세요.");
     System.out.println("1. 버스 2. 지하철");
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     if(num == 1) {
             System.out.println("버스를 타고 갑니다.");
             System.out.println("승차할 번호를 선택하세요.");
             Scanner A = new Scanner(System.in);
             int number = A.nextInt();
             if (number==100) {
                     System.out.println("100번 버스를 타고 갑니다.");
                     takeBus(bus100);
                     if(money<0) {
                             System.out.println("잔액이 부족합니다.");
                             }else {
                             System.out.println(studentName + "님의 남은 돈은"+ money + "입니다.");
                             }
                     }else {
                             System.out.println("다른 노선은 없습니다.");
                     }
             
     }else if(num == 2) {
             System.out.println("지하철를 타고 갑니다.");
             System.out.println("지하철 호선을 선택하세요.");
             Scanner A = new Scanner(System.in);
             int number = A.nextInt();
             if (number < 9) {
                     System.out.println("1-8호선을 타고 갑니다.");
                     takeSubway(subwayLine2);
                     if(money<0) {
                             System.out.println("잔액이 부족합니다.");
                     }else {
                             System.out.println(studentName + "님의 남은 돈은"+ money + "입니다.");
                     }
             }else {
                     System.out.println("다른 노선은 없습니다.");
             }
             
     }else {
             System.out.println("저런! 택시가 필요하신가요?");
     }
		
		
	}
	
	public String showStudentName1() {
		return "1반 인원 : " + studentName;
	}
	
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은"+ money + "입니다.");
	}
	
	

}
