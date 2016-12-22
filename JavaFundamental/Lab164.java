class Lab164
{
	public static void main(String[] args)
	{
		char ch ='A';

		for(int i = 0;i<5;i++)//rows
		{
			for(int j =0;j<=i;j++)//column
			{
				System.out.print(ch+"");
			}
			System.out.println();
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab164.java

E:\JLC Fundamental Lab>java Lab164
A
AA
AAA
AAAA
AAAAA
*/