package Activity.Selection.Problem;

public class activityselectionproblem {
	private String item;
	private int start;
	private int finish;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
	@Override
	public String toString() {
		return "activityselectionproblem [item=" + item + ", start=" + start + ", finish=" + finish + "]";
	}
	

}