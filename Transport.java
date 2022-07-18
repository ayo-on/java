package quiz;

import java.util.ArrayList;



public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> Student1 = new ArrayList<Student>();

		 Student1.add(new Student("세나",1000));
		 Student1.add(new Student("안나",1500));
		 Student1.add(new Student("유이",2000));
		 
		 ArrayList<Student> Student2 = new ArrayList<Student>();
		 Student2.add(new Student("안젤",1000));
		 Student2.add(new Student("루나",2000));
		 
		 for(int i = 0; i < Student1.size(); i++) {
			 Student info1 = Student1.get(i);
			 System.out.println(info1.showStudentName1());
			}
		 
		 System.out.println("----------------------");
		 
		 for(int i = 0; i < Student2.size(); i++) {
			 Student info2 = Student2.get(i);
			 System.out.println(info2.showStudentName1());
			}
		 
		
		 
		 
		 Student1.get(0).ride();
		 
		 
		 
		
		 Student2.get(1).ride();
		 
		 
			 
		 
	}

}
