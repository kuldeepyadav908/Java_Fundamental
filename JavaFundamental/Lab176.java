class Lab176
{
	public static void main(String[] args)
	{
		char ch = 'A';
		int row = 0;
		do
		{
			int col = 0;
			do
			{
				System.out.print(ch+"");
				col++;
			}
			while(col <= row);
			System.out.println();
			row++;
		}
		while(row<5);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab176.java

E:\JLC Fundamental Lab>java Lab176
A
AA
AAA
AAAA
AAAAA
*/