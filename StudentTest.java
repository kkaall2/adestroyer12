package test;

public class StudentTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student();
		Student student2 = new Student("이지환",23);
		
		student1.name ="홍길동";
		student1.age = 26;
		student1.major = "컴퓨터공학";
				
		System.out.println(student1.name + student1.age + student1.major);
		System.out.println(student2.name);
		
		
		
		
		
		
		
	}

}
