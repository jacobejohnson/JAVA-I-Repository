package Model;
import static org.junit.Assert.*;

import org.junit.Test;

public class InstructorTest {

	@Test
	public void testMakeEmailAddress() {
		Instructor test = new Instructor();
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("kit", "cat"));
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("KIT", "CAT"));
	}
	
	Instructor wsmith = new Instructor("Wanda", "Smith", "-");
	
	Instructor wfitz = new Instructor("Wilma", "Fitz", "-");
}
