class Lab177
{
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i == 5)
				break;
			System.out.println("Inside Loop");
		}
		System.out.println("Outside Loop");
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab177.java

E:\JLC Fundamental Lab>java Lab177
0
Inside Loop
1
Inside Loop
2
Inside Loop
3
Inside Loop
4
Inside Loop
5
Outside Loop
*/