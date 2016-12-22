class Lab142
{
	public static void main(String[] args)
	{
		int a = 130;
		int b = 20;
		int c = 15;
		int max = 0;

		if(a>b && a>c)
			max = a;
		else if(b>a && b>c)
			max = b;
		else
			max = c;
		System.out.println(max);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab142.java

E:\JLC Fundamental Lab>java Lab142
20
*/