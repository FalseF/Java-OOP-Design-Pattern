package OOP_MvcPattern;

public class Student {
	private String RollNo,Name,BloodGroup;
	public String getName()
	{
		return Name;
	}
	public String getRollNo()
	{
		return RollNo;
	}
	
	public String getBloodGroup()
	{
		return BloodGroup;
	}
	 
	public void setRollNo(String roll)
	{
		this.RollNo=roll;
	}
	
	public void setName(String name)
	{
		this.Name=name;
	}
	public void setBloodGroup(String Blood)
	{
		this.BloodGroup=Blood;
	}
	

}
