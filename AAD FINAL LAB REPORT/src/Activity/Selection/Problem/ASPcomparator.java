package Activity.Selection.Problem;

import java.util.Comparator;

public class ASPcomparator implements Comparator<activityselectionproblem> {
	@Override
	public int compare(activityselectionproblem o1, activityselectionproblem o2) {
		// TODO Auto-generated method stub
		return o1.getFinish() - o2.getFinish();
	}

}