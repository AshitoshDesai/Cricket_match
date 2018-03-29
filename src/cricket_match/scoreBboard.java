package cricket_match;

public class scoreBboard {

	private String team;
	private overs[] score;
	int final_total=0;

	
	public scoreBboard(String string, overs[] overs) {
		// TODO Auto-generated constructor stub
		this.team=string;
		this.score=overs;
	}
	


	public void totalscore() {
		// TODO Auto-generated method stub
		int total_overs=this.score.length;
		int score=0;
		//System.out.println(total_overs);
		for(int i=0;i<total_overs;i++){
		//score=this.score[i].getRuns_perOver().getBall1();
			score=overScore(i);
			final_total=final_total+score;
			System.out.println("the finalTotalscore of match");
			System.out.println(final_total);
		
	}

	}
	


	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}



	public overs[] getScore() {
		return score;
	}



	public void setScore(overs[] score) {
		this.score = score;
	}



	public int getFinal_total() {
		return final_total;
	}



	public void setFinal_total(int final_total) {
		this.final_total = final_total;
	}



	private int overScore(int i) {
		// TODO Auto-generated method stub
		int score=0;
		score=score + this.score[i].getRuns_perOver().getBall1()+this.score[i].getRuns_perOver().getBall2()+this.score[i].getRuns_perOver().getBall3()+this.score[i].getRuns_perOver().getBall4()+this.score[i].getRuns_perOver().getBall5()+this.score[i].getRuns_perOver().getBall6();
		
		return score;
	}
	
	
	

}
