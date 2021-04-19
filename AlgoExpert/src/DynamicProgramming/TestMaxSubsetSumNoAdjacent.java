package DynamicProgramming;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class TestMaxSubsetSumNoAdjacent {
	@Test
	  public void TestCase1() {
	    int[] input = {75, 105, 120, 75, 90, 135};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 330);
	  }
	
	@Test
	  public void TestCase2() {
	    int[] input = {7, 10, 12, 7, 9, 14};
	    assertTrue(MaxSubsetSumNoAdjacent.maxSubsetSumNoAdjacent(input) == 33);
	  }
}
