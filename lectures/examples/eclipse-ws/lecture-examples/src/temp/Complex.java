package temp;

public class Complex {
	double re;
	double im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	public void mul1(Complex c) {
		Complex temp = new Complex(re, im);
		re = re * c.re - im * c.im;
		im = temp.re * c.im + temp.im * c.re;
	}

	public void mul2(Complex c) {
		double temp = re * c.re - im * c.im;
		im = re * c.im + im * c.re;
		re = temp;
	}

	@Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}

}
