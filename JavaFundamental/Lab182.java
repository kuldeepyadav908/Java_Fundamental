class Lab182
{
	public static void main(String[] args)
	{
		JLC:
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i == 3)
				break JLC;
			System.out.println(i+"\t"+j);
			}
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab182.java

E:\JLC Fundamental Lab>java Lab182
1       1
1       2
1       3
2       1
2       2
2       3
*/