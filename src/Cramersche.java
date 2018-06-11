import java.io.*;
public class Cramersche implements ISolver
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader BR=new BufferedReader(new InputStreamReader (System.in));
        int Number[][]=new int[3][4];
        int i,j;
        String m;
        System.out.println("Enter Elements for Matrix 3x3 :");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=3;j++)
            {
                m=BR.readLine();
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

	@Override
	public void eingabeMatrix() {
		// TODO Auto-generated method stub
		
	}
}
