package cricket_match;

public class ScoringTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runPerball runs1=new runPerball(2,3,0,1,6,3);
		runPerball runs2=new runPerball(0,3,0,6,6,1);
		runPerball runs3=new runPerball(2,3,0,1,6,4);
		runPerball runs4=new runPerball(2,1,0,0,6,1);
		runPerball runs5=new runPerball(4,4,0,0,6,6);
		
		
		overs[] overs =new overs[5];
		overs[0]=new overs(1,runs1);
		overs[1]=new overs(2,runs3);
		overs[2]=new overs(3,runs5);
		overs[3]=new overs(4,runs2);
		overs[4]=new overs(5,runs1);
		overs[0].overScore();
		//scoreBboard b=new scoreBboard("India",overs);
		//b.totalscore();
		//System.out.println(b..getRuns_perOver().getBall1());
	}

}
