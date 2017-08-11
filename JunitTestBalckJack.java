import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestBalckJack {



	@Test
	public void testPrintMessage() {
		
		int y=BlackJack.twonumber(18,21);
		assertEquals(y, 21);
	}

	@Test
	public void testPrintMessage1() {
		
		int y=UniqueSum.twonumber(1, 2, 3);
		assertEquals(y, 6);
	}

	@Test
	public void testPrintMessag21() {
		
		boolean y=TooHot.twonumber(18);
		assertEquals(y, false);
	}

}
