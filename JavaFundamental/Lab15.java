class Lab15
{
	public static void main(String[] args)
	{
		final int a;
		a = 99;
		System.out.println(a);

		a = 98;
		System.out.println(a);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab15.java
Lab15.java:9: error: variable a might already have been assigned
                a = 98;
                ^
1 error
*/