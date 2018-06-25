import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author AWOE
 *
 */
class CramerscheTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testDet() {
		
		double[] line1 = {1,2,3};
		double[] line2 = {4, 5,6};
		double[] line3 = {7,8,9};
		double[][] numbers = {line1, line2, line3};
		double result = Cramersche.CalculateDet(numbers);
		assertEquals(result, 0, 0.1);
		
		double[] test2line1 = {2,5,2};
		double[] test2line2 = {3, -3, 1};
		double[] test2line3 = {1,4,-4};
		double[][] test2numbers = {test2line1, test2line2, test2line3};
		double test2result = Cramersche.CalculateDet(test2numbers);
		assertEquals(test2result, 111, 0.1);
		
	}
	
	
	@Test
	void testEquation() {
		
		double[] line1 = {-1,1,1,0};
		double[] line2 = {1,-3,-2,5};
		double[] line3 = {5,1,4,3};
		double[][] numbers = {line1, line2, line3};
		double[] result = Cramersche.Calculate(numbers);
		assertEquals(result[0], -1, 0.1);
		assertEquals(result[1], -4, 0.1);
		assertEquals(result[2], 3, 0.1);
	}

}
