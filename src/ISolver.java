
public interface ISolver {
	//Interface made by Andreas W�rrlein
	double det=0;
	double ergebnis[] = new double[3];
	double Number[][]=new double[3][4];
	
	public static double[][] eingabeMatrix() {
		return Number;
	}
	
	public static double[] Calculate(double[][] Number) {
		return ergebnis;
	}
	
	public static double CalculateDet(double[][] a) {
		return det;
	}
}
