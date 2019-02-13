package inheritanceexample;

public class InheritanceMain {

	public static void main(String[] args) {
		//BitmStudents bitm = new BitmStudents();
		SeipStudents seip = new SeipStudents();
		PaidStudents paid = new PaidStudents();
		
		seip.setName("Robin");
		seip.setCourseName("Mobile App Develop");
		seip.setSeid(235588);
		seip.setDuration(144);
		seip.setPhone("01711223344");
		seip.setExamMarks(35.0);
		seip.setProjectMarks(50.0);
		seip.setStipend(9360.0);
		
		paid.setName("Razib");
		paid.setCourseName("Dot Net");
		paid.setCollaborativeCompany("Leeds");
		paid.setCourseFee(15000.0);
		paid.setDuration(90);
		paid.setPhone("01551447788");
		paid.setProjectMarks(90.0);
		
		System.out.println(seip);
		System.out.println(paid);
		
		System.out.println(seip.getTotalMarks());
		System.out.println(paid.getTotalMarks());
		

	}

}
