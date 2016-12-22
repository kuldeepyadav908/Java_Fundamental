class Lab78
{
	public static void main(String[] args)
	{
		System.out.println(20 / 0.0);
		System.out.println(20 / -0.0);
		System.out.println(20.0 / 0);
		System.out.println(-20.0 / 0);

		double d1 = 10/0.0;
		System.out.println(d1);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab78.java

E:\JLC Fundamental Lab>java Lab78
Infinity
-Infinity
Infinity
-Infinity
Infinity
*/