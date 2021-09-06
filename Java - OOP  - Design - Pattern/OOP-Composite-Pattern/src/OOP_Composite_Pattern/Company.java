package OOP_Composite_Pattern;

public class Company {
	public static void main(String[] args) {
		
		Developer dev1 = new Developer(100, "Readul", "Pro Developer");//child or leaf node
        Developer dev2 = new Developer(101, "Sohag", "Developer");
        
        CompanyDirectory engDirectory = new CompanyDirectory();// Parent 
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
           
        Manager man1 = new Manager(200, "Readul Islam", "SEO Manager");
        Manager man2 = new Manager(201, "Faizul Haque ", "Kushagra's Manager");
           
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);
        
        accDirectory.showEmployeeDetails();
       
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
	}

}
