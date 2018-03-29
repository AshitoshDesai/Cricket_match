package cricket_match;

public class overs {

	private int over_no;
	private runPerball runs_perOver;

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

}
