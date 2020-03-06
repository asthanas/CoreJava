package co.zoomin.domains;

public class Batch {
	private Integer batchid;
	private String course;
	private Faculty faculty;
	public Batch(Integer batchid, String course, Faculty faculty) {
		super();
		this.batchid = batchid;
		this.course = course;
		this.faculty = faculty;
	}
	public Integer getBatchid() {
		return batchid;
	}
	public void setBatchid(Integer batchid) {
		this.batchid = batchid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
}
