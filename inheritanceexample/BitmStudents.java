package inheritanceexample;

public abstract class BitmStudents {
	private String name;
	private String phone;
	private String courseName;
	private int duration;
	private double projectMarks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public double getProjectMarks() {
		return projectMarks;
	}
	public void setProjectMarks(double projectMarks) {
		this.projectMarks = projectMarks;
	}
	
	public abstract double getTotalMarks();
	
	@Override
	public String toString() {
		return "BitmStudents [name=" + name + ", phone=" + phone + ", courseName=" + courseName + ", duration="
				+ duration + ", projectMarks=" + projectMarks + "]";
	}
	
	
	
}
