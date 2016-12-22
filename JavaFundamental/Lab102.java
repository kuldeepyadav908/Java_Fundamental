class Lab102
{
	public static void main(String[] args)
	{
		int a = 10;
		a *= 3 + 4;
		System.out.println(a);

		int b = 10;
		b = b * 3 + 4;
		System.out.println(b);

		int c = 10;
		c = c * (3 + 4);
		System.out.println(c);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab102.java

E:\JLC Fundamental Lab>java Lab102
70
34
70
*/