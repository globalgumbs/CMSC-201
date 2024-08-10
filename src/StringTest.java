/*
 * Class: CMSC201 
 * Instructor: Dr. Grinberg
 * Description: Statistics Project
 * Due: 07/22/2024
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Albert Gumbs
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	  @Test
	  public void testLength() {
		String str = new String();
	    assertEquals(str.length(), 0);
	    str = "Godzilla";
	    assertEquals(str.length(), 8);    
	  } 
	  
	  @Test
	  public void testCharAt() {
	    String str = "character";
	    assertEquals(str.charAt(2), 'a');
	  } 

	  @Test
	  public void testSubstring() {
		  String str = "character";
		  assertEquals(str.substring(0, 4), "char");
	  }
	  
	  @Test
	  public void testIndexOf() {
		  String str = "character";
		  assertEquals(str.indexOf('a'), 2);
	  }

}
