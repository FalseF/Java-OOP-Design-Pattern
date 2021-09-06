package OOP_Null_Object_Pattern;

public class Coder extends Person{

	public Coder(String name)
	{
		this.name = name;
	}
	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
