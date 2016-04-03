package zzzz;

public class Test {
	public static void main(String args[]){
		PaidStudent paidStudentA = new PaidStudent();
		PaidStudent paidStudentB = new PaidStudent();

		FreeStudent freeStudentA = new FreeStudent();
		FreeStudent freeStudentB = new FreeStudent();

		
		OnlineCourse course = new OnlineCourse();
		course.registerStudent(paidStudentA);
		course.registerStudent(paidStudentB);
		course.registerStudent(freeStudentA);
		course.registerStudent(freeStudentB);
		course.changeClassTime("Apr 5 - 18:10");
		System.out.println("-----------------------------------------------------");
		
		course.removeStudent(freeStudentA);
		course.removeStudent(freeStudentB);
		course.changeClassTime("Apr 10 - 20:10");
		System.out.println("-----------------------------------------------------");

		PaidStudent paidStudentC = new PaidStudent();
		course.registerStudent(paidStudentC);
		course.changeClassTime("Jun 15 - 16:10");


		/**Test result
		 	Paid Student 1- Notified new class time: Apr 5 - 18:10
			Paid Student 2- Notified new class time: Apr 5 - 18:10
			Free Student 1- Notified new class time: Apr 5 - 18:10
			Free Student 2- Notified new class time: Apr 5 - 18:10
			-----------------------------------------------------
			Paid Student 1- Notified new class time: Apr 10 - 20:10
			Paid Student 2- Notified new class time: Apr 10 - 20:10
			-----------------------------------------------------
			Paid Student 1- Notified new class time: Jun 15 - 16:10
			Paid Student 2- Notified new class time: Jun 15 - 16:10
			Paid Student 3- Notified new class time: Jun 15 - 16:10
		 */
	}
}
