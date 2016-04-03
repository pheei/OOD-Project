package zzzz;

public interface Course {
	public void registerStudent(Student observer);
	public void removeStudent(Student observer);
	public void notifyStudent();
}
