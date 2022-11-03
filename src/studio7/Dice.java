package studio7;

public class Dice {
	
	private int n;

	public Dice(int n) {
		this.n = n;
	}
	
	public int throwDie() {
		return (int)(Math.random() * n) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice(1000);
		System.out.println(d.throwDie());
	}

}
