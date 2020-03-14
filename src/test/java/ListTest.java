import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ListTest {

	GenericStack<Integer> s;
	
	@BeforeEach
	void init() {
		s = new GenericStack<Integer>(300);
	}
	
	@AfterEach
	void after() {
		s = null;
	}
	
	@Test
	void testInitGS() {
		assertEquals("GenericStack", s.getClass().getName(),"init failed on GS");
	}
	
	@Test
	void testInitNode() {
		assertEquals("GenericList$Node", s.getHead().getClass().getName(), "node not init");
	}
	
	@Test
	void testNodeVal() {
		assertEquals(300, s.pop(), "value wrong in Node: not 200");
	}
	
	@Test
	void testEmptyList() {
		s.pop();
		assertNull(s.getHead());
	}
	
	@ParameterizedTest
	@ValueSource(chars = {'a','a','a','a'})
	void isLetterA(char input) {
		assertEquals('a', input, "not letter 'a'");
	}

	@Test
	void test1()
	{
		s.push(1);
		assertEquals(1, s.pop(), "Most recent values in the stack");
	}
	
	//checks the most return value in the stack after doing queue and pop multiple times
	@Test
	void test2()
	{
		s.push(1);
		s.pop(); //removes 1
		s.push(2);
		s.pop(); //removes 2
		assertEquals(300, s.pop(), "Most recent values in the stack");	//removes 300
	}
	
	@Test
	void test3()	//checks the length
	{
		s.push(1);
		s.push(2);
		assertEquals(3, s.getLength(), "Checks the length");
	}
	
	@Test
	void test4()
	{
		GenericStack<Double> doubleChecker = new GenericStack<Double>(1.2);
		doubleChecker.push(1.3);
		doubleChecker.push(21.3);
		assertEquals(3, doubleChecker.getLength(), "Checks the length");	
	}

	@Test
	void test5() 	//generic data type
	{
		GenericStack<String> stringChecker = new GenericStack<String>("Hello World");
		assertEquals("Hello World", stringChecker.pop(), "last popping string should be Hello World");
	}
	
	@Test
	void test6() 	//generic data type
	{
		GenericStack<String> stringChecker = new GenericStack<String>("Hello World");
		stringChecker.push("Het Banker");
		stringChecker.push("CS342");
		stringChecker.pop();
		assertEquals("Het Banker", stringChecker.pop(), "last popping string should be Het Banker");
	}
	
	@Test
	void test7() 	//generic data type
	{
		GenericStack<String> stringChecker = new GenericStack<String>("Hello World");
		stringChecker.push("Het Banker");
		stringChecker.push("CS342");
		stringChecker.pop();
		assertEquals(2, stringChecker.getLength(), "length should be 2");
	}
	
	@Test
	void test8()	//checks for not null
	{
		s.push(2);
		assertNotNull(s.getHead(), "List should not be null");
	}
	
	@Test
	void test9()	//returns true or false depending on the value of the length
	{
		s.push(3);
		assertTrue(s.getLength() == 2, "length should be 2");
	}
	
	@Test
	void test10()	//returns true or false depending on the value of the length of type string
	{
		GenericStack<String> stringChecker = new GenericStack<String>("Hello World");
		stringChecker.push("Het Banker");
		assertTrue(stringChecker.getLength() == 2, "length should be 2");
	}
	
	@Test
	void test11()	//returns true or false depending on the value of the length of type string
	{
		GenericStack<String> stringChecker = new GenericStack<String>("Hello World");
		stringChecker.push("Het Banker");
		assertFalse(stringChecker.getLength() == 1, "length should be 2");
	}
	
	@Test
	void test12()	//returns true or false depending on the value of the length of type string
	{
		s.dumpList();
		assertTrue(s.getLength() == 0, "length should be 0");
	}
	@Test
	void test13()	//returns true or false depending on the value of the length of type string
	{
		s.dumpList();
		s.push(1);
		assertEquals(1 ,s.getLength(), "length should be 1");
	}
	
	@Test
	void test14()	//checking for negative length
	{
		s.push(2);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		assertEquals(0 ,s.getLength(), "length should be 0");
	}

//	@Test
//	void test9()
//	{
//		s.push(2);
//		assertArrayEquals(Iterable<I> {2,300} ,s.dumpList(), "value should be ");
//	}
	
	
}
