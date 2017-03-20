/**
 * SE 1011
 * Winter 2010-2011
 * Lab 6
 * Dan Kass
 * 1/25/11
 */
package kassd;

public class FractionDriver {

	public static void main(String[] args) {
		Fraction.setDecimalFormatSelected(false);
		Fraction fractionOne = new Fraction(1, 2);
		Fraction fractionTwo = new Fraction(6, 11);
		
		System.out.println("Is it set to Return Fractions? " + Fraction.isDecimalFormatSelected());
		
		Fraction sum = fractionOne.add(fractionTwo);
		Fraction difference = fractionOne.subtract(fractionTwo);
		Fraction product = fractionOne.multiply(fractionTwo);
		

		System.out.println("Your fisrt fraction is " + fractionOne.toString());
		System.out.println("Your second fraction is " + fractionTwo.toString());
		System.out.println("When you add those two togeather you get "
				+ sum.toString());
		System.out
				.println("When you subtract the first one to the second one you get "
						+ difference.toString());
		System.out.println("When you multiply them togeather you get "
				+ product.toString());
		System.out.println("Are your two Fractions Equal? " + fractionOne.equals(fractionTwo));

	}
}
