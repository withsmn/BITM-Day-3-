package inheritanceexample;

public class PaidStudents extends BitmStudents{
	private double courseFee;
	private String collaborativeCompany;
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public String getCollaborativeCompany() {
		return collaborativeCompany;
	}
	public void setCollaborativeCompany(String collaborativeCompany) {
		this.collaborativeCompany = collaborativeCompany;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+" PaidStudents [courseFee=" + courseFee + ", collaborativeCompany=" + collaborativeCompany + "]";
	}
	@Override
	public double getTotalMarks() {
		// TODO Auto-generated method stub
		return super.getProjectMarks();
	}
	
	
}
