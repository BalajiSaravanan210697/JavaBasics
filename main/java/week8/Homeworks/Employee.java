package week8.Homeworks;

public class Employee {
	int id;
	int age;
  
	//default Constructor
	Employee(){
    	System.out.println("Default:");
    }
	
	//Parameterized constructor
	Employee(int idnumber,int agevalue){
    	id=idnumber;
    	age=agevalue;
    }
	
	void displaydetails() {
		System.out.println(id+ " details " +age);
	}
	
	public static void main(String[] args) {
		//creating objects  
		Employee s1=new Employee(113,23);  
		Employee s2=new Employee();  
		
		//displaying values of the object  
		s1.displaydetails();  
		s2.displaydetails(); 
	}
}
