package inheritanceexample;

public class SeipStudents extends BitmStudents{
	private int seid;
	private double stipend;
	private double examMarks;
	
	public int getSeid() {
		return seid;
	}
	public void setSeid(int seid) {
		this.seid = seid;
	}
	public double getStipend() {
		return stipend;
	}
	public void setStipend(double stipend) {
		this.stipend = stipend;
	}
	public double getExamMarks() {
		return examMarks;
	}
	public void setExamMarks(double examMarks) {
		this.examMarks = examMarks;
	}
	
	@Override
	public double getTotalMarks() {
		// TODO Auto-generated method stub
		return examMarks + super.getProjectMarks();
	}
	@Override
	public String toString() {
		return super.toString()+" SeipStudents [seid=" + seid + ", stipend=" + stipend + ", examMarks=" + examMarks + "]";
	}
	
	
}
