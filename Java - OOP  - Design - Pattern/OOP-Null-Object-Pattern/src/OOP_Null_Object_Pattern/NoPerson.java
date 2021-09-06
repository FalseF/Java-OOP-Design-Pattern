package OOP_Null_Object_Pattern;

public class NoPerson extends Person{

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available Programmer";
	}
	

}
