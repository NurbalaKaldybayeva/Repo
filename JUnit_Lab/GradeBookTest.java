package JUnit_Lab;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeBookTest {

	GradeBook g1;
	GradeBook g2;
	
	@Before
	public void setUp() throws Exception {
		g1= new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g2= new GradeBook(5);
		g2.addScore(60);
		g2.addScore(85);
		
	}

	@After
	public void tearDown() throws Exception {
		g1=null;
		g2=null;
	}
	
	@Test
	public void testSum()	{

		assertEquals(125, g1.sum(), .0001);
		assertEquals(145, g2.sum(), .0001);
	}
	
	@Test
	public void  testMinimum() { 
			assertEquals(50, g1.minimum(), .001);
			assertEquals(60, g2.minimum(), .001);
	}
	
	@Test
	public void  addScoreTest() {

			assertTrue(g1.toString().equals("50.0 75.0 "));
			assertTrue(g2.toString().equals("60.0 85.0 "));
			
	}
	@Test
	public void  finalScoreTest() {
		assertEquals(75, g1.finalScore(), .001);
		assertEquals(85, g2.finalScore(), .001);
			
	}
	
	@Test
	public void  getScoreTest() {
		assertEquals(2, g1.getScoreSize() , .001);
		assertEquals(2, g2.getScoreSize(), .001);
			
	}
	
}
