class Lab186
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("\n"+i);
			for(int j=1;j<=5;j++,System.out.println("j++"));
			{
				if(i == 3)
				continue;
			System.out.println("JLC"+i);
			}
		}
	}
}


/*
Output
=======

E:\JLC Fundamental Lab>javac Lab186.java

E:\JLC Fundamental Lab>java Lab186

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
SKIP(JLC3)

4
j++
j++
j++
j++
j++
JLC4

5
j++
j++
j++
j++
j++
JLC5
*/