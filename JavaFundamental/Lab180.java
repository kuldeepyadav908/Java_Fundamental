class Lab180
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\n"+i);
			for(int j=1;j<=5;j++,System.out.println("j++"));
			{
				if(i == 3)
				break;
			System.out.println("JLC"+i);
			}
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab180.java

E:\JLC Fundamental Lab>java Lab180

1
j++
j++
j++
j++
j++
JLC1

2
j++
j++
j++
j++
j++
JLC2

3
j++
j++
j++
j++
j++
*/