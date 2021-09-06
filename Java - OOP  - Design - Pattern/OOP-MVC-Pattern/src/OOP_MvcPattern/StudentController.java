package OOP_MvcPattern;

public class StudentController {
	
	private Student model;
	private StudentView view;
	public StudentController(Student model,StudentView view)
	{
		this.model = model;
		this.view = view;
		
	}
	
	public void setStudentName(String name)
	{
		model.setName(name);
	}
	
	public void setStudentRoll(String roll)
	{
		model.setRollNo(roll);
	}
	
	public void setStudentBloodGroup(String blood)
	{
		model.setBloodGroup(blood);
	}
	
	public String getStudentName()
	{
		return model.getName();
	}
	
	public String getStudentRollNo()
	{
		return model.getRollNo();
	}
	
	public String getStudentBloodGroup()
	{
		return model.getBloodGroup();
	}
	
	void updateView()
	{
		view.printStudentDetails(model.getName(),model.getRollNo(),model.getBloodGroup());
	}



}
