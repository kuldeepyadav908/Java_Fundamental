class Lab122
{
	public static void main(String[] args)
	{
		int a = 12;
		boolean b = a < 10 || a++ < 5;
		System.out.println(a);
		System.out.println(b);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab122.java

E:\JLC Fundamental Lab>java Lab122
13
false
*/