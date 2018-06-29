import java.io.*;
import java.util.Arrays;
public class Cramersche implements ISolver
{
   
    public static void main(String args[]) throws IOException
    {
    	double[][] eingabe = eingabeMatrix();
    	System.out.println("\n now calculating");
        Calculate(eingabe);
    }
    //this Method is from Andreas Wörrlein--------------------------------
	//GUI Part -> cannot be tested by unit tests
    public static double[][] eingabeMatrix() throws IOException, IllegalArgumentException{
		//delarations and initizialises
    	double Number[][]=new double[3][4];
		BufferedReader BR=new BufferedReader(new InputStreamReader (System.in));
        //rows and columns
		int i,j;
        String m = null;
        //Asks the User to write his Matrix
        System.out.println("Enter Elements for Matrix 3x3 :");
        
        
        	//For-loop for the rows
			for(i=0;i<=2;i++)
			{
				//For-loop for the columns
			    for(j=0;j<=3;j++)
			    {
			        try {
			        	//if last column then ask for y-value
			        	if(j==3)
			        	{
			        		System.out.print("y: ");
							m=BR.readLine();
			        	}
			        	//else then ask for x-value
			        	else 
			        	{
			        		System.out.print("x"+(j+1)+": ");
							m=BR.readLine();
			        	}
			        	
					} catch (IOException e) {
						// TODO Auto-generated catch block
					}
			        //if can parse to Double then write it in Array
			        try {
				        Number[i][j]=Double.parseDouble(m);			        	
			        }
			        //if cant parse to Double, then ask again for Number
			        catch(NumberFormatException e) {j--;}
			    }
			}
		
		//prints the Matrix in console
        System.out.println("LGS:");
                                System.out.println("");
        for(i=0;i<=2;i++)
        {
        	
            for(j=0;j<=3;j++)
            {
                System.out.print(Number[i][j]+"\t");
            }
            System.out.println();
        }
        
        return Number;
		
	}
    //-------------------------------------------------------------------------------
    
    
    //This method is from Fabian Schurk/////////////////////////////////////////////
	//https://de.wikibooks.org/wiki/MathGymOS/_LGS/_Das_Determinanten-Verfahren
	public static double[] Calculate(double[][] Number) {
		double ergebnis[] = new double[3];
		double[][] matrix = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = Number[i][j];
			}
		}
		double[][] tempArray = new double[3][3];
		double detA = CalculateDet(Number);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					tempArray[k][j]= matrix[k][j];
				}
			}
			//tempArray = matrix.clone();
			for(int j = 0; j <3; j++) {//
				tempArray[j][i]=Number[j][3];
				System.out.print(tempArray[j][0]+"\t");
			}
			if(detA!=0) { //One Lösung
				ergebnis[i] = Math.round((CalculateDet(tempArray)/detA)*100)/100.0;
			}
			else {ergebnis=null;
			break;
			}
			System.out.println(ergebnis[i]);
		}
		if(ergebnis!=null) {
		System.out.println("Ergebnis: \n");
		System.out.println(ergebnis[0]+"\t"+ ergebnis[1]+"\t" + ergebnis[2]);
		return ergebnis;}
		else {
			System.out.println("Nicht eindeutig lösbar. Es gibt mehrere oder keine Lösung!");
			double noSolution[] = { Double.NaN, Double.NaN, Double.NaN};
			return noSolution; ////////////fis
		}
	}
	public static double CalculateDet(double[][] a) {
		double det= 
				a[0][0]*a[1][1]*a[2][2]+
				a[0][1]*a[1][2]*a[2][0]+
				a[0][2]*a[1][0]*a[2][1]-				
				a[0][2]*a[1][1]*a[2][0]-
				a[0][0]*a[1][2]*a[2][1]-
				a[0][1]*a[1][0]*a[2][2];		
				
		return det;
	}

}

/////////////////////////////////////////////////////////////////////////
