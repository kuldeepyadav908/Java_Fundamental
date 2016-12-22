class Lab75
{
	public static void main(String[] args)
	{
		final byte b1 = 90;
		final byte b2 = 38;
		byte b3 = b1 + b2;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab75.java
Lab75.java:7: error: incompatible types: possible lossy conversion from int to byte
                byte b3 = b1 + b2;
                             ^
1 error
*/