package co.zoomin.domains;

public class Student {
	private Integer studid;
	private String sname, email, mobile;

	public Student() {
	}

	public Student(String sname, String email, String mobile) {
		this.sname = sname;
		this.email = email;
		this.mobile = mobile;
	}

	public Student(Integer sid, String sname, String email, String mobile) {
		this(sname, email, mobile);
		this.studid = sid;
	}

	public Integer getStudid() {
		return studid;
	}

	public void setStudid(Integer studid) {
		this.studid = studid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [" + studid + " | " + sname + " | " + email + " | " + mobile + "]";
	}

}
