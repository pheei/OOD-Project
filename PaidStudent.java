package zzzz;

public class PaidStudent implements Student{

	private String classTime;
	public static int counter=1;
	private int id;
	
	public PaidStudent(){
		this.id = counter;
		this.counter++;
	}
	
	@Override
	public void update(String classTime) {
		// TODO Auto-generated method stub
		this.classTime = classTime;
		System.out.println("Paid Student "+ id + "- Notified new class time: " + classTime);
		System.out.println("Class ticket link: www.myonlinecourse.org/class/new_course/" + (100000 + (int)(Math.random() * 999999)) );
		System.out.println();

	}

}
