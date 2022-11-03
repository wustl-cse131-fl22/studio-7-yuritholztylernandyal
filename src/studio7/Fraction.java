package studio7;

public class Fraction {
	
	private double num;
	private double den;

	public Fraction(double num, double den) {
		this.num = num;
		this.den = den;
	}
	
	public double getNum() {
		return num;
	}
	
	public double getDen() {
		return den;
	}
	
	
	public Fraction addFrac(Fraction frac) {
		double num = frac.getDen() * this.num + frac.getNum() * this.den;
		double den = frac.getDen() * this.den;
		return new Fraction(num,den);
	}
	
	public Fraction multFrac(Fraction frac) {
		return new Fraction(this.num * frac.getNum(),frac.getDen() * this.den);
	}
	
	public Fraction recip() {
		return new Fraction(this.den, this.num);
	}
	
	public Fraction simplify() {
		double factor = gcd(this.num, this.den);
		return new Fraction(this.num/factor,this.den/factor);
	}
	
	public static double gcd(double p, double q) {
		while (q != 0) {
			double temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public String toString() {
		return this.num + "/" + this.den;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac = new Fraction(9,12);
		Fraction frac1 = new Fraction(1,2);
		System.out.println(frac.addFrac(frac1));
		System.out.println(frac.multFrac(frac1));
		System.out.println(frac.recip());
		System.out.println(frac.simplify());
	}

}
