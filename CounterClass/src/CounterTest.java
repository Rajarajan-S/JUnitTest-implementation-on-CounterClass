import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter; // Declaring Counter for testing
	
	@BeforeEach
	void setUp() throws Exception {
		this.counter = new Counter(); // Initialize counter before every test method
	}

	@Test
	void testIncrement() {		
		// Calling Increment method returns 1 in the first call
		assertTrue(this.counter.Increment() == 1);
		
		// Calling Increment method returns 2 in the second call
		assertTrue(this.counter.Increment() == 2);
		
		// Calling Increment method 3rd time
		this.counter.Increment(); // Counter stores the value as 3
		
		assertFalse(this.counter.GetCount() == 2, "You have called Increment method 3rd time. Should not return 2");
		
		// Expecting 3 as return which is the correct case
		assertEquals(3, this.counter.GetCount());
		
		// Calling Increment method 4th time should not return 3
		assertNotEquals(3,this.counter.Increment());
	}

	@Test
	void testDecrement() {	
		// Calling Decrement method returns -1 in the first call
		assertEquals(-1, this.counter.Decrement());
		
		// Calling Decrement method returns -2 in the second call
		assertTrue(this.counter.Decrement() == -2);
		
		// Calling Decrement method 3rd time
		this.counter.Decrement(); // Counter stores the value as -3
		
		assertFalse(this.counter.GetCount() == -2, "You have called Decrement method 3rd time. Should not return -2");
		
		// Calling Decrement method returns -3 in the third call
		assertTrue(this.counter.GetCount() == -3);
	}
}


