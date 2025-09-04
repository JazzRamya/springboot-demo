package service_interface;

import entity.Student;

public interface StudentService 
{
	void addStudentDetails(Student student,Student studentList[]);
    void getDetailsById(int studentId,Student studentList[]);
    void updateStudentDetail(int studentId,Student newStudent,Student studentList[]);
    void removeDataById(int studentId,Student studentList[]);
	
}