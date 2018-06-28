
public interface ISolver {
	//Interface made by Andreas Wörrlein
	//declarations
	double det=0;
	double ergebnis[] = new double[3];
	double Number[][]=new double[3][4];
	
	
	//Method for reading and writing Matrix
	public static double[][] eingabeMatrix() {
		return Number;
	}
	//Method for Calculate Matrix
	public static double[] Calculate(double[][] Number) {
		return ergebnis;
	}
	//Method for calculate Solution of Determinante
	public static double CalculateDet(double[][] a) {
		return det;
	}
}
