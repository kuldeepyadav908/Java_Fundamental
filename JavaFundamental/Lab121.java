class Lab121
{
	public static void main(String[] args)
	{
		int a = 12;
		boolean b = a > 10 || a++ < 5;
		System.out.println(a);
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab121.java

E:\JLC Fundamental Lab>java Lab121
12
true
*/