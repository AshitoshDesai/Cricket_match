package cricket_match;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class runPerballTest {

	runPerball runs1,runs2,runs3,runs4,runs5,runs6;
	@Before
	public void setUp() throws Exception {
		 runs1=new runPerball(2,3,0,1,6,3);
		 runs2=new runPerball(0,3,0,6,6,1);
		 runs3=new runPerball(2,3,0,1,6,4);
		 runs4=new runPerball(2,1,0,0,6,1);
		 runs5=new runPerball(4,4,0,0,6,6);
	}

	@Test
	public final void testGetBall1() {
		//fail("Not yet implemented"); // TODO
		assertEquals(2,runs1.getBall1());
	}

	@Test
	public final void testGetBall2() {
		//fail("Not yet implemented"); // TODO
		assertEquals(3,runs1.getBall2());
	}

	@Test
	public final void testGetBall3() {
		//fail("Not yet implemented"); // TODO
		assertEquals(0,runs1.getBall3());
	}

	@Test
	public final void testGetBall4() {
		//fail("Not yet implemented"); // TODO
		assertEquals(1,runs1.getBall4());
	}

	@Test
	public final void testGetBall5() {
		//fail("Not yet implemented"); // TODO
		assertEquals(6,runs1.getBall5());
	}

	@Test
	public final void testGetBall6() {
		//fail("Not yet implemented"); // TODO
		assertEquals(3,runs1.getBall6());
	}

}
