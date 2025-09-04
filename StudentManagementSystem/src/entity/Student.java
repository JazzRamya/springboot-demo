package entity;

public class Student 
{
	private int studentId;
	private String studentName;
	private String department;
	private int overAllMark;
	public Student (int studentId,String studentName,String department,int overAllMark)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.department=department;
		this.overAllMark=overAllMark;
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getOverAllMark() {
		return overAllMark;
	}
	public void setOverAllMark(int overAllMark) {
		this.overAllMark = overAllMark;
	}
	public void display() 
	{
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(department);
		System.out.println(overAllMark);
		
	}
}
