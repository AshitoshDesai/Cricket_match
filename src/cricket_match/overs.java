package cricket_match;

public class overs {

	private int over_no;
	private runPerball runs_perOver;
	int Score_perOver=0;

	public int getOver_no() {
		return over_no;
	}

	public runPerball getRuns_perOver() {
		return runs_perOver;
	}

	public overs(int i, runPerball runs) {
		// TODO Auto-generated constructor stub
		this.over_no=i;
		this.runs_perOver=runs;
	}
	
	void overScore() {
		// TODO Auto-generated method stub
		int score=0;
		score=score + this.getRuns_perOver().getBall1()+this.getRuns_perOver().getBall2()+this.getRuns_perOver().getBall3()+this.getRuns_perOver().getBall4()+this.getRuns_perOver().getBall5()+this.getRuns_perOver().getBall6();
		
		System.out.println("score:"+score);
	}

}
