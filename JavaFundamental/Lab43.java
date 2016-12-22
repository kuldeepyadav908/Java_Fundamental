class Lab43
{
	public static void main(String[] args)
	{
		byte b = 128;
		short s = 32768;
		int i = 2147483648;
		long l = 2147483648;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab43.java
Lab43.java:7: error: integer number too large: 2147483648
                int i = 2147483648;
                        ^
Lab43.java:8: error: integer number too large: 2147483648
                long l = 2147483648;
                         ^
2 errors
*/