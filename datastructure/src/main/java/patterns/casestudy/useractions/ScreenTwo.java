package patterns.casestudy.useractions;

import java.util.Queue;

public class ScreenTwo {

	private final Queue<UserAction> actionQueue;
	
	public ScreenTwo(Queue<UserAction> actonQueue){
		this.actionQueue = actonQueue;
	}
	
	public void simulateUserAction(){
		PrintUserAction action = new PrintUserAction("screen two action");
		actionQueue.add(action);
	}
	
}
