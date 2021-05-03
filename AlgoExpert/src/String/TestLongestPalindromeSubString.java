package String;
import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Test;

public class TestLongestPalindromeSubString {

	@Test
	  public void TestCase1() {
	    assertTrue(LongestPalindromeSubString.longestPalindromicSubstring("abaxyzzyxf").equals("xyzzyx"));
	  }
	
	@Test
	  public void TestCase2() {
	    assertTrue(LongestPalindromeSubString.longestPalindromicSubstring("abcdefgfedcbazzzzzzzzzzzzzzzzzzzz").equals("zzzzzzzzzzzzzzzzzzzz"));
	  }
}
