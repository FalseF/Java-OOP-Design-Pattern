package OOP_Null_Object_Pattern;

public class PersonData {
	
	public static final String[]  names = {"Sohag","Readul","Faizul"};
	 public static Person getProgrammer(String name)
	    {
	        for (int i = 0; i < names.length; i++) 
	        {
	            if (names[i].equalsIgnoreCase(name))
	            {
	                return new Coder(name);
	            }
	        }
	        return new NoPerson();
	    }

}
