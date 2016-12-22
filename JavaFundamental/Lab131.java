class Lab131
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int max = a>b ? a:b;
		System.out.println(max);

		int min = a<b ? a:b;
		System.out.println(min);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab131.java

E:\JLC Fundamental Lab>java Lab131
20
10
*/