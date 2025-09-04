package service;
import entity.Student;
import service_interface.StudentService;

public class StudentServiceImplement implements StudentService 
{
	public static int index=0;
	public void addStudentDetails(Student student, Student[] studentList) 
	{
		studentList[index]=student;
		index++;
	}
	
	public void getDetailsById(int studentId, Student[] studentList) 
	{
		for(Student student:studentList) 
		{
			if(studentId==student.getStudentId()) 
			{
				student.display();
				return;
			}
		}
		System.out.println("Not Fount");
	}
	
	public void updateStudentDetail(int studentId,Student student, Student[] studentList) 
	{
		Student oldData=null;
		for(Student student1:studentList) 
		{
			oldData=student1;
			if(studentId==student.getStudentId()) 
			{
				oldData.setStudentId(student.getStudentId());
				oldData.setStudentName(student.getStudentName());
				oldData.setDepartment(student.getDepartment());
				oldData.setOverAllMark(student.getOverAllMark());
			}
			student.display();
			return;
		}
	}
	
	@Override
	public void removeDataById(int studentId, Student[] studentList) 
	{
		for(int i=0;i<studentList.length;i++) 
		{
			Student student=studentList[i];
		if(studentId==studentList[i].getStudentId()) 
		{
			studentList[i]=null;
		}
	    }
	}
	
}