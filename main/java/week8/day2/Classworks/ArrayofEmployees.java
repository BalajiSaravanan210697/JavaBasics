package week8.day2.Classworks;

import org.junit.Test;

public class ArrayofEmployees {
	private String name;
	private int age;

	private  ArrayofEmployees(String name, int age) {
        this.name = name;
        this.age = age;
     }
	 public String getName() {
	        return name;
	    }
	 public int getAge() {
	        return age;
	    }
	 @Test
	 public void test() {
		 ArrayofEmployees("Balaji",26);
		 System.out.println(name);
		 System.out.println(age);
	 }
	private void ArrayofEmployees(String string, int i) {
		  this.name = name;
	        this.age = age;
		
	}
	 public String getName1() {
	        return name;
	    }
	 public int getAge1() {
	        return age;
	    }
	
	
	
}
