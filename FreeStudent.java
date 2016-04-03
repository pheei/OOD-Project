package zzzz;

public class FreeStudent implements Student{
	private String classTime;
	public static int counter=1;
	private int id;
	
	public FreeStudent(){
		this.id = counter;
		this.counter++;
	}
	
	@Override
	public void update(String classTime) {
		// TODO Auto-generated method stub
		this.classTime = classTime;
		System.out.println("Free Student "+ id + "- Notified new class time: " + classTime);
	}

}
