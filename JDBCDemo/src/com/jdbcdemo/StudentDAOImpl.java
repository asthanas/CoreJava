package com.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
	private static Statement st = null;
	
	public StudentDAOImpl() throws Exception{
		Connection con = ConnectionFactory.getConnection();
		st = con.createStatement();
	}
	

	@Override
	public void saveStd(Student std) throws Exception {
		String sql = "insert into student values("+std.getStd_id()+",'"+std.getStd_name()+"',"+std.getStd_class()+","+std.getStd_marks()+")";
		//int n = st.executeUpdate(sql);
		st.execute(sql);
		int n = st.getUpdateCount();
		if(n>0) {
			System.out.println("Student Record Saved");
		}

	}

	@Override
	public void updateStd(Student std) throws Exception {
		String sql = "update student set std_name ='"+std.getStd_name()+",std_class="+std.getStd_class()+",std_marks="+std.getStd_marks()+" where std_id="+std.getStd_id();
		//int n = st.executeUpdate(sql);
		st.execute(sql);  
		int n = st.getUpdateCount();
		if(n>0) {
			System.out.println("Employee Saved");
		}

	}

	@Override
	public void deleteStd(int sno) throws Exception {
		String sql = "delete from student where std_id="+sno;
		//int n = st.executeUpdate(sql);
		st.execute(sql);  
		int n = st.getUpdateCount();
		if(n>0) {
			System.out.println("Student Record Saved");
		}
		else 
			System.out.println("No Matching student record for deletion");

	}

	@Override
	public Student searchStd(int sno) throws Exception {
		Student std = null;
		String sql = "select * from student where std_id="+sno;
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			int std_id=rs.getInt(1);
			String std_name = rs.getString(2);
			int std_class = rs.getInt(3);
			float std_marks = rs.getFloat(4);
			std = new Student(std_id, std_name, std_class, std_marks);
		}
		return std;
	}

	@Override
	public List<Student> getStudents() throws Exception {
		String sql = "select * from student";
		List<Student> stds = new ArrayList<>();
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			int std_id=rs.getInt(1);
			String std_name = rs.getString(2);
			int std_class = rs.getInt(3);
			float std_marks = rs.getFloat(4);
			Student std = new Student(std_id, std_name, std_class, std_marks);
			stds.add(std);		 
		} 
		return stds;
	}

}
