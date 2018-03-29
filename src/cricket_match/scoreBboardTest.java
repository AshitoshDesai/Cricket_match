package cricket_match;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class scoreBboardTest {

	runPerball runs1,runs2,runs3,runs4,runs5,runs6;
	overs[] overs ;
	scoreBboard b;
	@Before
	public void setUp() throws Exception {
		 runs1=new runPerball(2,3,0,1,6,3);
		 runs2=new runPerball(0,3,0,6,6,1);
		 runs3=new runPerball(2,3,0,1,6,4);
		 runs4=new runPerball(2,1,0,0,6,1);
		 runs5=new runPerball(4,4,0,0,6,6);
		 
		 overs[] overs =new overs[5];
			overs[0]=new overs(1,runs1);
			overs[1]=new overs(2,runs3);
			overs[2]=new overs(3,runs5);
			overs[3]=new overs(4,runs2);
			overs[4]=new overs(5,runs1);
			
			 b=new scoreBboard("India",overs);
	}

	@Test
	public final void testTotalscore() {
		//fail("Not yet implemented"); // TODO
		b.totalscore();
		assertEquals(82,b.getFinal_total());
	}

	@Test
	public final void testGetTeam() {
		//fail("Not yet implemented"); // TODO
		assertEquals("India",b.getTeam());
	}
	

}
