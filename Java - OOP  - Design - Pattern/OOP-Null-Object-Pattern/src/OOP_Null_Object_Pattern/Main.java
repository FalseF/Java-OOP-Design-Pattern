package OOP_Null_Object_Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person person = PersonData.getProgrammer("Sohag");
		Person person1 = PersonData.getProgrammer("abcd");

        System.out.println("Bool -> "+person.isNull()+":  Name ->"+person.getName());
        System.out.println("Bool -> "+person1.isNull()+":  Name ->"+person1.getName());
	}

}
