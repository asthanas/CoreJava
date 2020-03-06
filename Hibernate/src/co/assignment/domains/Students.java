package co.assignment.domains;

public class Students {
	private Integer id,marks;
	private String name;
	

	public Students() {
	}

	public Students(Integer id , String name, Integer marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [" + id + " | " + marks + " | " + name + "]";
	}
	
	
}
