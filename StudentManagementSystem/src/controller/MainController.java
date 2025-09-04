package controller;
import java.util.*;
import entity.Student;
import service.StudentServiceImplement;
import service_interface.StudentService;
public class MainController 
{
	//private static final Student Student = null;
	public static Student studentList[];
	public static Scanner scanner=new Scanner(System.in);
	private static StudentService service=new StudentServiceImplement();
	//private static Student stc=new Student(101,"Jaz","Maths",1000);
	public static Student creatNewStudent() 
	{
		System.out.println("Enter The Id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter The Name");
		String name=scanner.nextLine();
		System.out.println("Enter The Department");
		String department=scanner.nextLine();
		System.out.println("Enter The OverAllMaek");
		int overAllMark=scanner.nextInt();
		Student student=new Student(id,name,department,overAllMark);
		return student;
	}
	public static void displayOptions() 
	{
		System.out.println("1.Add New Student Details");
		System.out.println("2.Get Student Details By Id");
		System.out.println("3.Update Student Details");
		System.out.println("4.Delete Srudent Detailes");
		int choise=scanner.nextInt();
		getSwitchCace(choise);
	}
    public static void getSwitchCace(int choise) 
    {
        int studentId;
    	switch (choise) 
         {
    	case 1:
    		System.out.println("Enter Student Count;");
    		int size=scanner.nextInt();
    		studentList = new Student[size];
    		for(int i=0;i<size;i++) 
    		{
    			service.addStudentDetails(creatNewStudent(),studentList) ;
    		}
    		break;
    	case 2:
    		System.out.println("Enter Student Id");
    		studentId=scanner.nextInt();
    	    service.getDetailsById(studentId,studentList);
    	    //stc.display();
    		break;
    	case 3:
    		System.out.println("Enter Student Id");
    		studentId=scanner.nextInt();
    		System.out.println("Enter New Student Detail");
    		service.updateStudentDetail(studentId,creatNewStudent(),studentList);
    		break;
    	case 4:
    		System.out.println("Enter Student Id");
    		studentId=scanner.nextInt();
    		service.removeDataById(studentId,studentList);
    		break;	
    	}
    }
}
