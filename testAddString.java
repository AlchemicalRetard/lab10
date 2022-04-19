package Lab10_E20CSE062Package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		Lab10_E20CSE038Function junitsting = new Lab10_E20CSE038Function();
		String result=junitsting.addString("Hello"," World");
		assertEquals("Hello World",result);
	}

}
