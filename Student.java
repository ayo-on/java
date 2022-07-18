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
         Subway subwayLine2 = new Subway("2ȣ��");
     System.out.println("������ ��������� �����ϼ���.");
     System.out.println("1. ���� 2. ����ö");
     Scanner in = new Scanner(System.in);
     int num = in.nextInt();
     if(num == 1) {
             System.out.println("������ Ÿ�� ���ϴ�.");
             System.out.println("������ ��ȣ�� �����ϼ���.");
             Scanner A = new Scanner(System.in);
             int number = A.nextInt();
             if (number==100) {
                     System.out.println("100�� ������ Ÿ�� ���ϴ�.");
                     takeBus(bus100);
                     if(money<0) {
                             System.out.println("�ܾ��� �����մϴ�.");
                             }else {
                             System.out.println(studentName + "���� ���� ����"+ money + "�Դϴ�.");
                             }
                     }else {
                             System.out.println("�ٸ� �뼱�� �����ϴ�.");
                     }
             
     }else if(num == 2) {
             System.out.println("����ö�� Ÿ�� ���ϴ�.");
             System.out.println("����ö ȣ���� �����ϼ���.");
             Scanner A = new Scanner(System.in);
             int number = A.nextInt();
             if (number < 9) {
                     System.out.println("1-8ȣ���� Ÿ�� ���ϴ�.");
                     takeSubway(subwayLine2);
                     if(money<0) {
                             System.out.println("�ܾ��� �����մϴ�.");
                     }else {
                             System.out.println(studentName + "���� ���� ����"+ money + "�Դϴ�.");
                     }
             }else {
                     System.out.println("�ٸ� �뼱�� �����ϴ�.");
             }
             
     }else {
             System.out.println("����! �ýð� �ʿ��ϽŰ���?");
     }
		
		
	}
	
	public String showStudentName1() {
		return "1�� �ο� : " + studentName;
	}
	
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����"+ money + "�Դϴ�.");
	}
	
	

}
