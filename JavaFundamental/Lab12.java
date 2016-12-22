class Lab12
{
	public static void main(String[] args)
	{
		final int a = 99;
		System.out.println(a);

		a = 88;
		System.out.println(a);
	}
}


/*
Output
======

E:\JLC Fundamental Lab>javac Lab12.java
Lab12.java:8: error: cannot assign a value to final variable a
                a = 88;
                ^
1 error
*/