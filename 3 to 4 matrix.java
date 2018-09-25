import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();
		int b[][]=new int[4][4];
		for(int i=0;i<3;i++)
		{   for(int j=0;j<3;j++)
			{	 b[i][j]=a[i][j];
			     b[3][3]+=a[i][j];
			     b[i][3]+=a[i][j];
			   	 b[3][i]+=a[j][i];
			}
		
		}
	
		for(int e[]:b)
		{	for(int w:e)
				System.out.print(w+"\t");
			System.out.println();
		}	
	}
}