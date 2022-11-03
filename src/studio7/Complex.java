package studio7;

public class Complex {
	
	private double imaginary;
	private double real;

	public Complex(double real, double imaginary) {
		this.imaginary = imaginary;
		this.real = real;
	}
	
	
	public double getImaginary() {
		return imaginary;
	}


	public double getReal() {
		return real;
	}


	public Complex add(Complex com) {
		return new Complex(this.real + com.getReal(), this.imaginary + com.getImaginary());
	}
	
	public Complex mult(Complex com) {
		return new Complex(((this.real * com.getReal()) - (this.imaginary * com.getImaginary())), this.real * com.getImaginary() + this.imaginary * com.getReal());
	}
	
	@Override
	public String toString() {
		return real + " + " + imaginary + "i";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex com = new Complex(3, 4);
		Complex com1 = new Complex(1,2);
		System.out.println(com);
		System.out.println(com.add(com1));
		System.out.println(com.mult(com1));
	}

}
