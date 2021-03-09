import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils mathUtils;
	int i;
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This will run before all");
	}
	
	@BeforeEach
	void init() {
		mathUtils=new MathUtils();
		System.out.println("Initilising---");
		
	}
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up...");
	}
	
	// @Test
	@DisplayName("one test")
	@RepeatedTest(3)
	void test(RepetitionInfo repetitionInfo) {
		
		int r=repetitionInfo.getCurrentRepetition();
		int t=repetitionInfo.getTotalRepetitions();
		System.out.println("This is test"+i);
		System.out.println("repetition "+r +" of "+ t);
		i++;
		
	}

	@Test
	@Tag("add")
	void testAdd() {
		// fail("Not yet implemented");
		// MathUtils mathUtils=new MathUtils();
		int expected=3;
		int actual=mathUtils.add(1, 2);
		assertEquals(expected,actual, "the add is not adding");

	}

	@Test
	@Disabled
	void testComputeCircleArea() {
		System.out.println("The wont print");
		fail("Not yet implemented");
	}

	@Test
	void testSubtract() {
		assumeTrue(false);
		fail("Not yet implemented");
	}

	@Test
	@Tag("multiply")
	void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		fail("Not yet implemented");
	}
	@Nested
	class AddTest {
		@Test
		@DisplayName("When adding positive")
		void testAddPositive() {
			// MathUtils mathUtils=new MathUtils();
			assertEquals(2,mathUtils.add(1, 1),"Should return the right sum");
			
		}
		
		@Test
		@DisplayName("When adding negative")
		void testAddNegative() {
			
			assertEquals(-2,mathUtils.add(-1, -1),()-> "Should return the right sum");
			
		}
	}

}
