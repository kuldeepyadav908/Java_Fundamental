class Lab76
{
	public static void main(String[] args)
	{
		final long a = 12;
		byte b1 = a;

		System.out.println(a);
		System.out.println(b1);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab76.java
Lab76.java:6: error: incompatible types: possible lossy conversion from long to byte
                byte b1 = a;
                          ^
1 error
*/