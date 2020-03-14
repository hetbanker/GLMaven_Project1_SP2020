import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	GenericQueue<Integer> s;
	
	@BeforeEach
	void init() {
		s = new GenericQueue<Integer>(300);
	}
	
	@AfterEach
	void after() {
		s = null;
	}
	
	@Test
	void testInitGS() {
		assertEquals("GenericQueue", s.getClass().getName(),"init failed on GQ");
	}
	
	@Test
	void testInitNode() {
		assertEquals("GenericList$Node", s.getHead().getClass().getName(), "node not init");
	}

	@Test
	void testNodeVal() {
		assertEquals(300, s.dequeue(), "value wrong in Node: not 200");
	}
	
	@Test
	void testEmptyList() {
		s.dequeue();
		assertNull(s.getHead());
	}
	
	@Test
	void test1()
	{
		s.enqueue(10);
		assertEquals(300, s.dequeue(), "Most recent values in the stack");
	}
		
	
	
	
	
	
	
	
}
