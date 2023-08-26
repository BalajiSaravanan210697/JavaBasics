package week9.Classworks;

import org.junit.Test;

public class IPAddress {
	       /*Given a valid IP address, return a defanged version of that IP address.
			A defanged IP address replaces every period "." with "[.]".
			Do Not Use the replaceAll()
			Example 1:
			Input: address = "1.1.1.1"
			Output: "1[.]1[.]1[.]1"  */
	/*Input  : String
	Output : String
	pesudocode: 
		1.Get the input String 
		2.Create a String to store the Changing string element
		3.for loop to iterate the String value 
		4.Initialise character and get the character from String
		5.   if the string equal to . then Append it to [.]
	    6.   else append the character and store back 
	    7.return the stored array string 
*/
	@Test
	public void test() {
		appendIPAddress("1.1.1.1");
	}

	public String appendIPAddress(String address) {
		String append = "";
		for (int i = 0; i < address.length(); i++) {
			char charactr = address.charAt(i);
			if (charactr == '.') {
				append += "[.]";
			} else {
				append += address.charAt(i);
			}

		}
		System.out.println(append);
		return append;

	}
}