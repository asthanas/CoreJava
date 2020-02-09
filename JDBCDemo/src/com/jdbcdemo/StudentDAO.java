package com.jdbcdemo;

import java.util.List;

public interface StudentDAO {
	void saveStd(Student std) throws Exception;
	void updateStd(Student std) throws Exception;
	void deleteStd(int sno) throws Exception;
	Student searchStd(int sno) throws Exception;
	List<Student> getStudents() throws Exception;
}
