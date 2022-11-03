package studio7;

public class HockeyPlayer {
	
	private String name;
	private int jersey;
	private boolean handedness;
	private int goals;
	private int assist;
	private int shoot;
	private int numGames = 0;

	public HockeyPlayer(String name, int jersey, boolean handedness, int goals, int assist, int shoot) {
		this.name = name;
		this.jersey = jersey;
		this.handedness = handedness;
		this.goals = goals;
		this.assist = assist;
		this.shoot = shoot;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
		numGames++;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}
	
	public int points() {
		return this.goals + this.assist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockeyPlayer p = new HockeyPlayer("Bob", 4, true, 4, 5, 2);
		System.out.println(p.points());
	}

}
