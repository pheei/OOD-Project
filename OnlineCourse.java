package zzzz;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse implements Course{
	private List<Student> observers = new ArrayList<Student>();
	private String classTime;

	@Override
	public void registerStudent(Student observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void removeStudent(Student observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
		if(index >= 0){
			observers.remove(observer);
		}
		
	}

	@Override
	public void notifyStudent() {
		// TODO Auto-generated method stub
		for(Student o: observers){
			o.update(classTime);
		}
		
	}
	
	public void changeClassTime(String time){
		this.classTime = time;
		notifyStudent();
	}

}
