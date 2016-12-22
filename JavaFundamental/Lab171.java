class Lab171
{
	public static void main(String[] args)
	{
		char ch = 'A';
		int i =0;
		while(i < 5)
		{
			int j = 0;
			while(j<=i)
			{
				System.out.print(ch+"");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab171.java

E:\JLC Fundamental Lab>java Lab171
A
AA
AAA
AAAA
AAAAA
*/