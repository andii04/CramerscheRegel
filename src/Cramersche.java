import java.io.*;
public class Cramersche 
{
    public static void main(String args[]) throws IOException
    {
    	wdeingabeMatrix();
        
    }

	
	public static void wdeingabeMatrix() {
		BufferedReader BR=new BufferedReader(new InputStreamReader (System.in));
        int Number[][]=new int[3][4];
        int i,j;
        String m = null;
        System.out.println("Enter Elements for Matrix 3x3 :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {
                try {
					m=BR.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Number[i][j]=Integer.parseInt(m);
            }
        }
        System.out.println("Elements in Matrix are : ");
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
}
