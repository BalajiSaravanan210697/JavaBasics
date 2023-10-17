package com.week16.Day5;

import org.junit.Test;

public class MostCommonWord {

@Test
public void test() {
	SpliiteStrings("Bob hit a ball, the hit BALL flew far after it was hit.");
}	

public String[] SpliiteStrings(String str) {

	String lowercase = str.toLowerCase();
	String result = lowercase.replaceAll("[^\\sa-zA-Z0-9]", "");
	String[] output = result.split(" ");
	return output;
}

  public String mostCommonWord(String paragraph, String[] banned) {
	  
	  
	return paragraph;
 
  }

}
