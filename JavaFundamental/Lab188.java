class Lab188
{
	public static void main(String[] args)
	{
		JLC://label
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i == 3)
				continue JLC;
			System.out.println(i+"\t"+j);
			}
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab188.java

E:\JLC Fundamental Lab>java Lab188
1       1
1       2
1       3
2       1
2       2
2       3
4       1
4       2
4       3
5       1
5       2
5       3
*/