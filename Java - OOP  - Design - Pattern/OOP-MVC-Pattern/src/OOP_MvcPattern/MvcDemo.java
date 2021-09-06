package OOP_MvcPattern;

public class MvcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student model = CreateStudentDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model,view);
		controller.updateView();
		controller.setStudentBloodGroup("R+");
		controller.updateView();
		
		

	}
	
	private static Student CreateStudentDatabase()
	{
		Student student = new Student();
		student.setName("Readul");
		student.setRollNo("17CSE038");
		student.setBloodGroup("B+");
		return student;
	}

	

}
