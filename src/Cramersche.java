import java.io.*;
import java.util.Arrays;
public class Cramersche 
{
    public static double Number[][]=new double[3][4];
	public static double ergebnis[] = new double[3];
    
    public static void main(String args[]) throws IOException
    {
    	eingabeMatrix();
    	System.out.println("now calculating");
        Calculate();
    }

	
	public static void eingabeMatrix() {
		BufferedReader BR=new BufferedReader(new InputStreamReader (System.in));
        int i,j;
        String m = null;
        System.out.println("Enter Elements for Matrix 3x3 :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {
                try {
                	System.out.println("x"+(j+1));
					m=BR.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Number[i][j]=Double.parseDouble(m);
            }
        }
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
		
	}
	
	public static  void Calculate() {
		
		double[][] matrix = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = Number[i][j];
				//System.out.print(i+" " + j);
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
				System.out.print(tempArray[j][0]);
			}
			if(detA!=0) {
				ergebnis[i] = Math.round((CalculateDet(tempArray)/detA)*100)/100.0;
			}
			else {ergebnis[i]=0;}
			System.out.println(ergebnis[i]);
		}
		System.out.println(ergebnis[0]+" "+ ergebnis[1]+ " " + ergebnis[2]);
		
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


