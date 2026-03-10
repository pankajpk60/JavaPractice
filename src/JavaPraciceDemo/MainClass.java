//package JavaPraciceDemo;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainClass {
//
//	public static void main(String[] args) {
//		
//		Student s1=new Student(1,"rahul",75,80,90);
//		Student s2=new Student(2,"pankaj",60,84,45);
//		Student s3=new Student(3,"naved",100,102,99);
//		
//		
//		StudentService service=new StudentService();
//		service.addStudent(s1);
//		service.addStudent(s2);
//		service.addStudent(s3);
//		
//		
//		service.
//		
//		
//		
//	
//
//	}
//
//}
//
//abstract class Person {
//	
//	private int id;
//	private String name;
//
//	public Person(int id2, String name2) {
//		
//		this.setId(id2);
//		this.setName(name2);
//	
//	}
//	abstract void DisplayAll();
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//}
//
//class Student extends Person {
//
//	private int M1, M2, M3, Total;
//	private String Grade;
//
//	public Student(int id, String name, int M1, int M2, int M3) {
//        super(id,name);
//		this.M1 = M1;
//		this.M2 = M2;
//		this.M3 = M3;
//		GradeDecision();
//
//	}
//
//	public void GradeDecision() {
//
//		Total = M1 + M2 + M3;
//		int Avg = Total / 3;
//
//		if (Avg >= 100)
//			Grade = "A";
//		else if (Avg >= 80)
//			Grade = "B";
//		else if (Avg >= 60)
//			Grade = "C";
//		else if (Avg >= 40)
//			Grade = "D";
//		else
//			Grade = "E";
//
//	}
//	
//	void DisplayAll()
//	{
//		System.out.println("id: " + getId() + " name: " + getName() + " M1: " + M1  + " M2: " + M2 + " M3: " +M3 +"Total: " + Total + " Grade: " + Grade);
//		
//	}
//
//}
//
//
//class StudentService{
//	
//	      
//	private List<Person> personList = new ArrayList<>();
//	
//         public void addStudent(Student s)
//         {
//        	 personList.add(s);
//         }
//	
//	  
//         for (Person p : personList) {
//        	    p.DisplayAll();  // Dynamic Binding
//        	}
//	
//	
//	
//}
//}
//
//
//
