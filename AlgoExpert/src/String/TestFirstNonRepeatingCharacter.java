package String;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFirstNonRepeatingCharacter {
	
	@Test
	  public void TestCase1() {
	    String input = "abcdcaf";
	    int expected = 1;
	    var actual = FirstNonRepeatingCharacter.firstNonRepeatingCharacter(input);
	    assertTrue(expected == actual);
	}
	
	@Test
	  public void TestCase2() {
	    String input = "aneesh";
	    int expected = 0;
	    var actual = FirstNonRepeatingCharacter.firstNonRepeatingCharacter(input);
	    assertTrue(expected == actual);
	}
}
