package Project1;
import java.util.Iterator;

import org.junit.Test;

import student.TestCase;
import student.TestableRandom;

/**
 * This class tests the methods of SkipList class
 * 
 * @author <your_name>
 * @version <version_no>
 */

@SuppressWarnings("unused")
public class SkipListTest extends TestCase {
	
	SkipList<String> sl;
	
	public void setUp() {
		// TODO: implement setup
		sl = new SkipList<String>();
	}

	/***
	 * Example 1: Test `randomLevel` method with 
	 * predetermined random values using `TestableRandom`
	 */
	public void testRandomLevelOne() {
		TestableRandom.setNextBooleans(false);
		sl = new SkipList<String>();
		int randomLevelValue = sl.randomLevel();
		
		// This returns 1 because the first preset 
		// random boolean is `false` which breaks 
		// the `while condition inside the `randomLevel` method
		int expectedLevelValue = 1;  
		
		// Compare the values
		assertEquals(expectedLevelValue, randomLevelValue);
	}
	
	/***
	 * Example 2: Test `randomLevel` method with 
	 * predetermined random values using `TestableRandom`
	 */
	public void testRandomLevelFour() {
		TestableRandom.setNextBooleans(true, true, true, false, true, false);
		sl = new SkipList<String>();
		int randomLevelValue = sl.randomLevel();

		// This returns 4 because the fourth preset 
		// random boolean is `false` which breaks 
		// the `while condition inside the `randomLevel` method
		int expectedLevelValue = 4; 
		
		// Compare the values
		assertEquals(expectedLevelValue, randomLevelValue);
	}
	
    // TODO: implement more tests
    

}
