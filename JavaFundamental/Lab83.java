class Lab83
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 4;
		int d = a - b / c;
		int e = (a - b) / c;

		System.out.println(d);
		System.out.println(e);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab83.java

E:\JLC Fundamental Lab>java Lab83
5
-2
*/