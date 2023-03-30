package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction sum(Fraction other) {
		int numerator = this.numerator * other.denominator + other.numerator*this.numerator;
		int denominator = this.denominator * other.denominator;
		Fraction fractionSum = new Fraction (numerator, denominator);
		return fractionSum;
	}
	
	public Fraction product (Fraction other) {
		int numerator = this.numerator * other.numerator;
		int denominator = this.denominator * other.denominator;
		Fraction fractionProduct = new Fraction (numerator, denominator);
		return fractionProduct;
	}
	
	public Fraction reciprocal () {
		int numerator = this.denominator;
		int denominator = this.numerator;
		Fraction fractionRecip = new Fraction (numerator, denominator);
		return fractionRecip;
	}
	
	public Fraction simplify() {
		if (numerator <= denominator) {
			for (int i = this.numerator; i > 0; i--) {
				if (this.denominator%i==0 && this.numerator%i == 0) {
					int numerator = this.numerator/i;
					int denominator = this.denominator/i;
					//System.out.println(numerator);
					//System.out.println(denominator);
					Fraction fractionSimp = new Fraction (numerator, denominator);
					return fractionSimp;
				}
			}
		}
		else {
			for (int i = this.denominator; i > 0; i--) {
				if (this.numerator%i==0 && this.denominator%i ==0) {
					int numerator = this.numerator/i;
					int denominator = this.denominator/i;
					//System.out.println(numerator);
					//System.out.println(denominator);
					Fraction fractionSimp = new Fraction (numerator, denominator);
					return fractionSimp;
				}
			}
		}
		Fraction fractionSimp = new Fraction (numerator, denominator);
		return fractionSimp;
		
		}

	public String toString() {
		return this.numerator + "/" + this.denominator;
}
	public static void main(String[] args) {
		Fraction fraction = new Fraction (16,64);
		fraction = fraction.simplify();
		System.out.println(fraction.toString());
		
	}
}
